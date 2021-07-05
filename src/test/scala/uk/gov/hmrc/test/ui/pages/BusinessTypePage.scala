/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object BusinessTypePage extends BasePage {
  val title: String = "Select Business Type"

  def businessTypeButton: WebElement = driver.findElement(By.id("business-other"))

  def selectType(): Unit = {
    businessTypeButton.click()
  }


}
