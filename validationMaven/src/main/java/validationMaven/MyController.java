package validationMaven;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class MyController {
	
	
@RequestMapping(value = "/")
    
public String home() {

        return "index";
    }


@ModelAttribute("myUser")

    public MyUser getLoginForm() {

        return new MyUser();
    }

 

    @RequestMapping(value = "/myForm", method = RequestMethod.GET)

    public String showForm(Map model) {

        return "myForm";

    }

 

    @RequestMapping(value = "/myForm", method = RequestMethod.POST)

    public String validateForm(@ModelAttribute("myUser") @Valid MyUser myUser,BindingResult result, Map model) {

            if (result.hasErrors()) {

            return "myForm";

        }

 

        model.put("myUser", myUser);

 

        return "success";

 

    }

 




}
