package com.dirghayumainali.restapi.controller;

import com.dirghayumainali.javapractice.basic.Calculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/hi/{a}/{b}")
    public String printWord(@PathVariable("a") int a, @PathVariable("b") int b){
        Calculator calculator = new Calculator();
        int x = calculator.add(a,b);
        return "<h1> Hello "+ x +"</h1>";
    }

    @GetMapping("/html")
    public String textgenerate(){
        return "<form action=\"#\" method=\"post\">\n" +
                "    <div>\n" +
                "         <label for=\"name\">Text Input:</label>\n" +
                "         <input type=\"text\" name=\"name\" id=\"name\" value=\"\" tabindex=\"1\" />\n" +
                "    </div>\n" +
                "\n" +
                "    <div>\n" +
                "         <h4>Radio Button Choice</h4>\n" +
                "\n" +
                "         <label for=\"radio-choice-1\">Choice 1</label>\n" +
                "         <input type=\"radio\" name=\"radio-choice-1\" id=\"radio-choice-1\" tabindex=\"2\" value=\"choice-1\" />\n" +
                "\n" +
                "     <label for=\"radio-choice-2\">Choice 2</label>\n" +
                "         <input type=\"radio\" name=\"radio-choice-2\" id=\"radio-choice-2\" tabindex=\"3\" value=\"choice-2\" />\n" +
                "    </div>\n" +
                "\n" +
                "  <div>\n" +
                "    <label for=\"select-choice\">Select Dropdown Choice:</label>\n" +
                "    <select name=\"select-choice\" id=\"select-choice\">\n" +
                "      <option value=\"Choice 1\">Choice 1</option>\n" +
                "      <option value=\"Choice 2\">Choice 2</option>\n" +
                "      <option value=\"Choice 3\">Choice 3</option>\n" +
                "    </select>\n" +
                "  </div>\n" +
                "\n" +
                "  <div>\n" +
                "    <label for=\"textarea\">Textarea:</label>\n" +
                "    <textarea cols=\"40\" rows=\"8\" name=\"textarea\" id=\"textarea\"></textarea>\n" +
                "  </div>\n" +
                "\n" +
                "  <div>\n" +
                "      <label for=\"checkbox\">Checkbox:</label>\n" +
                "    <input type=\"checkbox\" name=\"checkbox\" id=\"checkbox\" />\n" +
                "    </div>\n" +
                "\n" +
                "  <div>\n" +
                "      <input type=\"submit\" value=\"Submit\" />\n" +
                "    </div>\n" +
                "</form>";
    }
}
