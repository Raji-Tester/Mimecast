# Mimecast
Please check all branches 
Please check all branches 
Please check all branches 


This is a sample Repository for Mimecast
I just wrote this script for Mimecast using Clearscore website
How to Write Effective XPath Selenium Selectors – All Tactics Explained
XPath Selenium tactics will help you to write effective selenium find by statements especially for locating dynamic web elements in selenium webdriver projects. Generally, test automation engineers struggle to write dynamic XPath at the beginning of their test automation journeys. To address this pain, I prepared this tutorial for writing effective XPath in Selenium.

I shared all my tactics such as XPath contains text, sibling, ancestor, child, preceding, descendant, parent, and so on. I hope this article will help you to write smart and non-brittle selenium find by statements in your projects. Let’s start!

Table Of Contents

Dynamic Web Elements
XPath Selenium Selectors
Absolute and Relative XPath
Absolute XPath
Relative XPath
Writing Smart XPaths for Dynamic Elements
Tag – Attribute – Value Trio
Contains
Starts-with
Chained XPaths Declarations
XPath with “or” Statement
XPath with “and” Statement
XPath Text
Ancestor
Following
Child
Preceding
Following-sibling
Descendant
Parent
Locate an Element inside Array of Elements
Next Article: Selenium CSS Selectors (Complete Reference)
Selenium Webdriver Tutorial Series
Dynamic Web Elements
In our test automation codes, we generally prefer to use id, name, class, etc. these kinds of locators. However, sometimes we could not find any of them in the DOM and also sometimes locators of some elements change dynamically in the DOM. In these kinds of situations, we need to use smart locators. These locators must be capable to locate complex and dynamically changing web elements. In below sections, I will share with you 15 tactics to write effective XPath locators.

XPath Selenium Selectors
We can find the location of any element on a web page using XML path expressions. The basic syntax for XPath is shown below:

Syntax = //tagname[@attribute=’Value‘]

Example = //input[@id=’user-message‘]

xpath-selenium

You can also use class, name, link text, and the other attributes to locate an element with XPath as shown above.

Absolute and Relative XPath
Generally, in some test automation engineer interviews, I asked the difference between absolute and relative XPath. Actually, it is the answer is very easy.

Absolute XPath
It is a direct way to locate an element.
It is very brittle.
Starts with single slash “/” that means starting to search from the root.
Example: /html/body/div[2]/div/div[2]/div[1]/div[2]/form/div/input

xpath in selenium

Relative XPath
Starts from the middle of the HTML DOM.
Starts with a double slash “//” that means it can start to search anywhere in the DOM structure.
Shorter than Absolute XPath.
Less fragile.
Example: //div[@class=’form-group’]//input[@id=’user-message’]

dynamic xpath

Example: //*[@class=’panel-body’]//li[contains(text(),’entered in input field’)]

xpath contains

Writing Smart XPaths for Complex and Dynamic Elements
Tag – Attribute – Value Trio
Syntax: //tag[@attribute=’value‘]

Example: //input[@id, ‘user-message’]

xpath in selenium

Examples:

Java
1
2
3
4
5
6
7
8
9
10
11
12
//input[@type='send text']
 
//label[@id='clkBtn']
 
//input[@value='SEND']
 
//*[@class='swtestacademy']
--> "*" means, search "swtestacademy" class for all tags.
 
//a[@href='http://www.swtestacademy.com/']
 
//img[@src='cdn.medianova.com/images/img_59c4334feaa6d.png']
Contains
It is very handy XPath Selenium locator and sometimes it saves the life of a test automation engineer. When an attribute of an element is dynamic, then you can use contains() for the constant part of the web element but also you can use contains() in any condition when you need.

Syntax: //tag[contains(@attribute, ‘value‘)]

Example: //input[contains(@id, ‘er-messa’)]

xpath text contains

Examples:

Java
1
2
3
4
5
6
7
8
//*[contains(@name,'btnClk')]
--> It searches "btnClk" for all name attributes in the DOM.
 
//*[contains(text(),'here')]
--> It searches the text "here" in the DOM.
 
//*[contains(@href,'swtestacademy.com')]
--> It searches "swtestacademy.com" link in the DOM.
Starts-with
This method checks the starting text of an attribute. It is very handy to use when the attribute value changes dynamically but also you can use this method for non-changing attribute values.

Syntax: //tag[starts-with(@attribute, ‘value‘)]

Example: //input[starts-with(@id, ‘user’)]

xpath selenium java

Chained Declarations
We can chain multiple relative XPath declarations with “//” double slash to find an element location as shown below.

Example: //div[@class=’form-group’]//input[@id=’user-message’]

dynamic xpath in selenium webdriver

Operator “or”
In this method, we use two interrogation conditions such as A and B and return a result-set as shown below:

A	B	Result
False	False	No Element
True	False	Returns A
False	True	Returns B
True	True	Returns Both
“or” is case-sensitive, you should not use capital “OR”.

Syntax: //tag[XPath Statement-1 or XPath Statement-2]

Example: //*[@id=’user-message’ or @class=’form-control’]

selenium find element by xpath

Operator “and” 
In this method, we use two interrogation conditions such as A and B and return a result-set as shown below:

A	B	Result
False	False	No Element
True	False	No Element
False	True	No Element
True	True	Returns Both
“and” is case-sensitive, you should not use capital “AND”.

Syntax: //tag[XPath Statement-1 and XPath Statement-2]

Example: //*[@id=’user-message’ and @class=’form-control’]

how to write xpath in selenium

Text
We can find an element with its exact text.

Syntax: //tag[text()=’text value‘]

Example: .//label[text()=’Enter message’]

selenium by xpath

Ancestor
It finds the element before the ancestor statement and set it as a top node and then starts to find the elements in that node. In below example,

1- First, it finds the class which id is “container-fluid”

2- Then, starts to find div elements in that node.

Example: //*[@class=’container-fluid’]//ancestor::div

selenium xpath locator

You can select specific div groups by changing div depths as shown below.

.//*[@class=’container-fluid’]//ancestor::div[1] – Returns 13 nodes
.//*[@class=’container-fluid’]//ancestor::div[2] – Returns 7 nodes
.//*[@class=’container-fluid’]//ancestor::div[3] – Returns 5 nodes
.//*[@class=’container-fluid’]//ancestor::div[4] – Returns 3 nodes
.//*[@class=’container-fluid’]//ancestor::div[5] – Returns 1 node

Following
Starts to locate elements after the given parent node. It finds the element before the following statement and set as the top node and then starts to find all elements after that node. In below example,

1- First, it finds the form which id is “gettotal”

2- Then, starts to find all input elements after that node.

Example: .//form[@id=’gettotal’]//following::input 

selenium find by xpath

Child
Selects all children elements of the current node.

Example: //nav[@class=’fusion-main-menu’]//ul[@id=’menu-main’]/child::li

 

xpath child

You can also select the required “li” element by using li[1], li[2], li[3], etc. syntax as shown below.

xpath selenium examples

Preceding
Select all nodes that come before the current node. I give an example on swtestacademy. We will find all “li” elements in the homepage. First, we will locate the bottom element, then use preceding with “li” to find all “li” elements as shown below.

Example: //img[contains(@src,’cs.mailmunch.co’)]//preceding::li



Also, you can use [1], [2], etc. to select a specific element in the preceding element list.

Following-sibling
Select the following siblings of the context node.

Example: //*[@class=’col-md-6 text-left’]/child::div[2]//*[@class=’panel-body’]//following-sibling::li

xpath syntax selenium

Descendant
Identifies and returns all the element descendants to current element which means traverse down under the current element’s node. Below, the XPath returns all “li” elements under the “menu-main”.

Example: //nav[@class=’fusion-main-menu’]//*[@id=’menu-main’]//descendant::li

descendant

Parent

Returns the parent of the current node as shown in the below example.

Example: .//*[@id=’get-input’]/button//parent::form

parent

Locate an Element inside Array of Elements
In Trivago website, lets search “Antalya” keyword. Then, find the first Odamax hotel with XPath.

First, we can find all Odamax hotels by using its text with below XPath:

//span[contains(text(),’odamax’)]

contains text

Above XPath returns many Odamax hotel’s, we can select the first one with below XPath expression:

(//span[contains(text(),’odamax’)])[1]

contains text in selenium

You can also continue to search and find the related hotel’s price element with below XPath:

(//span[contains(text(),’odamax’)])[1]/following-sibling::strong[@class=’deals__price’]

