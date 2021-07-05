/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.{AddressPage, ApplicationCompletePage, AreYouSurePage, BusinessNamePage, BusinessTypePage, ContactNumberPage, DashboardPage, DeleteSuccessfulPage, HomePage, LoginPage, LogoutSuccessfulPage, NameEntryPage, PasswordPage, SummaryPage}

class UserPathStepDef extends BaseStepDef {

  Given("I am at the HomePage") { () =>
    HomePage.goHere()
  }
  When("I try to login without an account") { () =>
    HomePage.startLogin()
    LoginPage.checkTitle() shouldBe true
    LoginPage.login()
  }
  Then("Login fails") { () =>
    LoginPage.checkTitle() shouldBe true
  }

  When("I click register") { () =>
    HomePage.startRegister()
  }
  When("I enter my name") { () =>
    NameEntryPage.checkTitle() shouldBe true
    eventually {
      NameEntryPage.enterName()
      NameEntryPage.submit()
    }
  }
  When("I enter my business name") { () =>
    BusinessNamePage.checkTitle() shouldBe true
    BusinessNamePage.enterBusinessName()
    BusinessNamePage.submit()
  }
  When("I enter my contact number") { () =>
    ContactNumberPage.checkTitle() shouldBe true
    eventually {
      ContactNumberPage.enterNumber()
      ContactNumberPage.submit()
    }
  }
  When("I enter my address") { () =>
    AddressPage.checkTitle() shouldBe true
    eventually {
      AddressPage.enterDetails()
      AddressPage.submit()
    }
  }
  When("I select my business type") { () =>
    BusinessTypePage.checkTitle() shouldBe true

    BusinessTypePage.selectType()
    BusinessTypePage.submit()

  }
  When("I enter my password") { () =>
    PasswordPage.checkTitle() shouldBe true
    eventually {
      PasswordPage.enterPassword()
      PasswordPage.submit()
    }
  }
  When("I submit the data") { () =>
    SummaryPage.checkTitle() shouldBe true
    eventually {
      SummaryPage.checkName shouldBe true
      SummaryPage.checkBusinessName shouldBe true
      SummaryPage.checkContactNumber shouldBe true
      SummaryPage.checkProperty shouldBe true
      SummaryPage.checkBusinessType shouldBe true
      SummaryPage.submit()
    }
    eventually {
      LoginPage.testCRN = ApplicationCompletePage.getCRN
      ApplicationCompletePage.submit()
    }
  }
  When("I am on the dashboard and I can logout") { () =>
    eventually {
      DashboardPage.checkTitle() shouldBe true
      DashboardPage.logoutButton
      DashboardPage.logout()
      LogoutSuccessfulPage.checkTitle() shouldBe true
      LogoutSuccessfulPage.submit()
    }
  }
  When("I login") { () =>
    LoginPage.checkTitle() shouldBe true
    LoginPage.login()
  }
  When("I delete my account") { () =>
    DashboardPage.checkTitle() shouldBe true
    DashboardPage.delete()
  }

  When("I click confirm") { () =>
    AreYouSurePage.checkTitle() shouldBe true
    AreYouSurePage.submit()
  }
  When("I get a confirmation message") { () =>
    DeleteSuccessfulPage.checkTitle() shouldBe true
    DeleteSuccessfulPage.submit()
  }

}
