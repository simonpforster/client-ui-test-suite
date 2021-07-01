/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.{ExamplePage, PayOnlinePage}

class GoogleStepDefTest extends BaseStepDef {
  Given("I Am At Google") { () =>
    driver.navigate().to("https://www.google.com/")
    eventually {
      driver.getTitle should be("Google")
    }
  }

  When("I am there") { () =>
    eventually{
      driver.getTitle should be("Google")
    }
  }
  Then("I SHOULD DEFINATELY BE THERE") { () =>
    eventually{
      driver.getTitle should be("Google")
    }
  }
//  Given("a user navigates to payments page") { () =>
//    driver.navigate().to(PayOnlinePage.url)
//  }
//
//  When("the user chooses to pay VAT tax") { () =>
//    val vatId = "tax_to_pay-2"
//    driver.findElement(By.id(vatId)).click()
//    driver.findElement(By.id("next")).click()
//  }
//
//  Then("payment details page is displayed") { () =>
//    eventually {
//      driver.getTitle should be("Choose a way to pay - Pay your VAT - GOV.UK")
//    }
//  }
}
