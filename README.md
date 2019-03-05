# Mimecast
Please check all branches 
Please check all branches 
Please check all branches 

post man 

1.Tag – Attribute – Value Trio  =  Syntax = //tagname[@attribute=’Value‘]  Example: //input[@id, ‘user-message’]

2.Contains       Syntax: //tag[contains(@attribute, ‘value‘)]    Example: //input[contains(@id, ‘er-messa’)]
 
3.Starts-with   Syntax: //tag[starts-with(@attribute, ‘value‘)]  Example: //input[starts-with(@id, ‘user’)]

4.Chained XPaths Declarations   Example: //div[@class=’form-group’]//input[@id=’user-message’]

44  XPath with “or” Statement    Syntax: //tag[XPath Statement-1 or XPath Statement-2]   Example: //*[@id=’user-message’ or @class=’form-control’]

433  XPath with “and” Statement

422  XPath Text    Syntax: //tag[text()=’text value‘]    Example: .//label[text()=’Enter message’]

7. Ancestor:It finds the element before the ancestor statement and set it as a top node and then starts to find the elements in that node. In below example,  Example: //*[@class=’container-fluid’]//ancestor::div     .//*[@class=’container-fluid’]//ancestor::div[1] – Returns 13 nodes

8. Following   Example: .//form[@id=’gettotal’]//following::input 

9. Child  Example: //nav[@class=’fusion-main-menu’]//ul[@id=’menu-main’]/child::li

10. Preceding  Example: //img[contains(@src,’cs.mailmunch.co’)]//preceding::li


11. Following-sibling    Example: //*[@class=’col-md-6 text-left’]/child::div[2]//*[@class=’panel-body’]//following-sibling::li

12. Descendant:Descendant
Identifies and returns all the element descendants to current element which means traverse down under the current element’s node. Below, the XPath returns all “li” elements under the “menu-main”.

Example: //nav[@class=’fusion-main-menu’]//*[@id=’menu-main’]//descendant::li


13. Parent   Example: .//*[@id=’get-input’]/button//parent::form
Locate an Element inside Array of Elements  In Trivago website, lets search “Antalya” keyword. Then, find the first Odamax hotel with XPath.

14. First, we can find all Odamax hotels by using its text with below XPath:

//span[contains(text(),’odamax’)]
(//span[contains(text(),’odamax’)])[1]
You can also continue to search and find the related hotel’s price element with below XPath:

(//span[contains(text(),’odamax’)])[1]/following-sibling::strong[@class=’deals__price’]

=======================================================================================================
There are several distinct, key XPath concepts in play here...

Absolute vs relative XPaths (/ vs .)

/ introduces an absolute location path, starting at the root of the document.
. introduces a relative location path, starting at the context node.
Named element vs any element (ename vs *)

/ename selects an ename root element
./ename selects all ename child elements of the current node.
/* selects the root element, regardless of name.
./* or * selects all child elements of the context node, regardless of name.
descendant-or-self axis (//*)

//ename selects all ename elements in a document.
.//ename selects all ename elements at or beneath the context node.
//* selects all elements in a document, regardless of name.
.//* selects all elements, regardless of name, at or beneath the context node.


=====================================================================================
 Intermediate:  
 *  // filter ,map or sorting we can chain multiple intermediate operation (zero or more) 
 *  // because it will pass the stream next ,enable parallel stream for multiple Treading 
 *    
 *  	.anyMatch();     	.flatmap();  
 *  	.distinct();  		.map()
 *      .filter();			.skip()
 *      .find first 		.sorted()
 *      	  
 *   *  
 *  Terminate:    
 *  // such as forEach,collect or either void or return a NonStream result 
 *  //one terminal operation is allowed
 *  	forEach applies same function to each element 
 *  	collect saves elements into collection
 *  	other options reduce the stream to a single summary elements 
 *  
 *  	.count()		reduce()
 *  	.match()		summaryStatistics()
 *  	.min()	
 *  
 * 		findFirst();
 *  	forEach();
 =====================================================================================================
 Open Postman.
Enter URL in the URL bar http://{server:port}/json/metallica/post.
Click Headers button and enter Content-Type as header and application/json in value.
Select POST from the dropdown next to the URL text box.
Select raw from the buttons available below URL text box.
Select JSON from the following dropdown.
In the textarea available below, post your request object
