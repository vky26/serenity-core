package some.other.place;

import net.serenitybdd.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class BaseScenarioInSomeOtherPackage extends ScenarioSteps{

    public BaseScenarioInSomeOtherPackage(Pages pages) {
        super(pages);
    }

    public String returnFoo() {
        return "proportionOf";
    }

}
