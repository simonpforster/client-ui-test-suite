/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.{HomePage, LoginPage}

class UserPathStepDef extends BaseStepDef {

  Given("I am at the HomePage") { () =>
    eventually {
      HomePage.goHere()
    }
  }
  When("I try to login without an account") { () =>
    eventually {
      HomePage.startLogin()
    }
    eventually {
      LoginPage.checkTitle() shouldBe true
      LoginPage.login()
    }
  }
  Then("Login fails") { () =>
    eventually {
      LoginPage.checkTitle() shouldBe true
    }
  }

  When("I Then register") { () =>
  }
  When("I logout and login") { () =>
    //pass crn from register page
  }
  Then("My Account has been deleted")
}
