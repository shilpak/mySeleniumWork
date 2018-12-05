'''
Created on Jul 11, 2018

@author: Shilpa
'''
from   selenium import webdriver
from   selenium.common.exceptions import TimeoutException
from selenium.webdriver.support.ui import WebDriverWait
  
driver = webdriver.Chrome('C:/chromedriver.exe')
driver.get('https://www.facebook.com')
  
username = driver.find_element_by_id("email")
password = driver.find_element_by_id("pass")
submit   =driver.find_element_by_id("loginbutton")
  
username.send_keys( "shilpa_kothari@hotmail.com" )
password.send_keys( "jiya2001" )
  
submit.click()

