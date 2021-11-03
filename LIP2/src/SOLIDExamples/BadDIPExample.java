/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOLIDExamples;

/**
 *
 * @author mauricio.moreira
 */
class FrontEndCode {
    public void typescript() {
        System.out.println("Developing with typescript code.");
    }
}

class BackEndCode {
    public void node() {
        System.out.println("Developing with node code.");
    }
}

class WebProject {
    public FrontEndCode frontend;
    public BackEndCode backend;
    public WebProject() {
        frontend = new FrontEndCode();
        backend = new BackEndCode();
    }
    public void developApp() {
        frontend.typescript();
        backend.node();
        System.out.println("Application Developed!");
    }
}


public class BadDIPExample {
    public static void main(String[] args) {
        WebProject webproject = new WebProject();
        webproject.developApp();
    }
}
