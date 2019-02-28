# Mimecast
Please check all branches 
Please check all branches 
Please check all branches 



Tag – Attribute – Value Trio  =  Syntax = //tagname[@attribute=’Value‘]  Example: //input[@id, ‘user-message’]

Contains       Syntax: //tag[contains(@attribute, ‘value‘)]    Example: //input[contains(@id, ‘er-messa’)]
 
Starts-with   Syntax: //tag[starts-with(@attribute, ‘value‘)]  Example: //input[starts-with(@id, ‘user’)]

Chained XPaths Declarations   Example: //div[@class=’form-group’]//input[@id=’user-message’]
XPath with “or” Statement    Syntax: //tag[XPath Statement-1 or XPath Statement-2]   Example: //*[@id=’user-message’ or @class=’form-control’]

XPath with “and” Statement

XPath Text    Syntax: //tag[text()=’text value‘]    Example: .//label[text()=’Enter message’]

Ancestor:It finds the element before the ancestor statement and set it as a top node and then starts to find the elements in that node. In below example,  Example: //*[@class=’container-fluid’]//ancestor::div     .//*[@class=’container-fluid’]//ancestor::div[1] – Returns 13 nodes

Following   Example: .//form[@id=’gettotal’]//following::input 

Child  Example: //nav[@class=’fusion-main-menu’]//ul[@id=’menu-main’]/child::li

Preceding  Example: //img[contains(@src,’cs.mailmunch.co’)]//preceding::li


Following-sibling    Example: //*[@class=’col-md-6 text-left’]/child::div[2]//*[@class=’panel-body’]//following-sibling::li

Descendant:Descendant
Identifies and returns all the element descendants to current element which means traverse down under the current element’s node. Below, the XPath returns all “li” elements under the “menu-main”.

Example: //nav[@class=’fusion-main-menu’]//*[@id=’menu-main’]//descendant::li


Parent   Example: .//*[@id=’get-input’]/button//parent::form
Locate an Element inside Array of Elements  In Trivago website, lets search “Antalya” keyword. Then, find the first Odamax hotel with XPath.

First, we can find all Odamax hotels by using its text with below XPath:

//span[contains(text(),’odamax’)]
(//span[contains(text(),’odamax’)])[1]
You can also continue to search and find the related hotel’s price element with below XPath:

(//span[contains(text(),’odamax’)])[1]/following-sibling::strong[@class=’deals__price’]

=======================================================================================================

