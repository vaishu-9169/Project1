package com.natwest.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.natwest.Model.BankAccountInfo;
import com.natwest.dao.BankAccountDAO;
import com.natwest.exception.BankTransactionException;
import com.natwest.form.SendMoneyForm;


@Controller
public class MainController {

    @Autowired
    private BankAccountDAO bankAccountDAO;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    @CrossOrigin(origins = "*" , allowedHeaders = "*")
    public String showBankAccounts(Model model) {
        List<BankAccountInfo> list = bankAccountDAO.listBankAccountInfo();

        model.addAttribute("accountInfos", list);

        return "accountsPage";
    }

    @RequestMapping(value = "/sendMoney", method = RequestMethod.GET)
    public String viewSendMoneyPage(Model model) {

        SendMoneyForm form = new SendMoneyForm(1L, 2L, 700d);

        model.addAttribute("sendMoneyForm", form);

        return "sendMoneyPage";
    }

 
    @RequestMapping(value = "/sendMoney", method = RequestMethod.POST)
    public String processSendMoney(Model model, SendMoneyForm sendMoneyForm) throws BankTransactionException {

        System.out.println("Send Money: " + sendMoneyForm.getAmount());

        bankAccountDAO.sendMoney(sendMoneyForm.getFromAccountId(), //
		        sendMoneyForm.getToAccountId(), //
		        sendMoneyForm.getAmount());
        return "redirect:/";
    }

}