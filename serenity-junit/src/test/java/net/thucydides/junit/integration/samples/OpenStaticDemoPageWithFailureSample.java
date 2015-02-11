package net.thucydides.junit.integration.samples;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.serenitybdd.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;
import net.thucydides.samples.DemoSiteSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * This is a very simple scenario of testing a single page.
 * @author johnsmart
 *
 */
@RunWith(ThucydidesRunner.class)
public class OpenStaticDemoPageWithFailureSample {

    @Managed(uniqueSession=true, driver = "htmlunit")
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "classpath:static-site/index.html")
    public Pages pages;
    
    @Steps
    public DemoSiteSteps steps;
        
    @Test
    public void the_user_opens_the_page() {
        steps.enter_values("Label 1", true);
        steps.should_have_selected_value("Label 2");
        steps.do_something();
    }    
    
    @Test
    public void the_user_opens_another_page() {
        steps.enter_values("Label 2", true);
        steps.do_something_else();
    }

    @Test
    public void the_user_opens_a_third_page() {
        steps.enter_values("Label 3", true);
        steps.do_something_else();
    }


}
