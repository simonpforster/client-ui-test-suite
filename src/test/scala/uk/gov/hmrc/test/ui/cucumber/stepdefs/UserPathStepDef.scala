/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.{AddressPage, ApplicationCompletePage, BusinessNamePage, BusinessTypePage, ContactNumberPage, HomePage, LoginPage, NameEntryPage, PasswordPage, SummaryPage}

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

  When("I click register") { () =>
    eventually{
      HomePage.startRegister()
    }
    eventually {
      NameEntryPage.checkTitle() shouldBe true
    }
  }
  When("I enter my name") { () =>
    eventually {
      NameEntryPage.enterName()
    }
    eventually {
     BusinessNamePage.checkTitle() shouldBe true
    }
  }
  When("I enter my business name") { () =>
    eventually {
      BusinessNamePage.enterName()
    }
    eventually {
      ContactNumberPage.checkTitle() shouldBe true
    }
  }
  When("I enter my contact number") { () =>
    eventually {
      ContactNumberPage.enterNumber()
    }
    eventually {
      AddressPage.checkTitle() shouldBe true
    }
  }
  When("I enter my address") { () =>
    eventually {
      AddressPage.enterDetails()
    }
    eventually {
      BusinessTypePage.checkTitle() shouldBe true
    }
  }
  When("I select my business type") { () =>
    eventually {
      BusinessTypePage.selectType()
    }
    eventually {
      PasswordPage.checkTitle() shouldBe true
    }
  }
  When("I enter my password") { () =>
    eventually {
      PasswordPage.enterPassword()
    }
    eventually {
      SummaryPage.checkTitle() shouldBe true
    }
  }
  When("I submit the data") { () =>
    eventually {
      SummaryPage.checkName shouldBe true
      SummaryPage.checkBusinessName shouldBe true
      SummaryPage.checkContactNumber shouldBe true
      SummaryPage.checkProperty shouldBe true
      SummaryPage.checkBusinessType shouldBe true
      SummaryPage.submit()
    }
    eventually{
      LoginPage.testCRN = ApplicationCompletePage.getCRN
    }
  }
}
