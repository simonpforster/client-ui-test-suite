/*
 * Copyright 2021 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}

object AddressPage extends BasePage {
 val title: String = "Enter Address"
  def propertyNoInput: WebElement = driver.findElement(By.id("property-number"))
  def postcodeInput: WebElement = driver.findElement(By.id("postcode"))

  def enterDetails():Unit = {
    propertyNoInput.sendKeys(testPropertyNo)
    postcodeInput.sendKeys(testPostcode)
    submit()
  }
}
