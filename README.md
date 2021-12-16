
In this assignment I acted as a developer for a software company Global Rain. Global Rain is an engineering company that specializes in custom software and development for entrepreneurs, businesses, and government agencies. I was assigned to work with Artemis Financial, a financial consulting company that develops individualized financial plans for savings, retirement, investments, and insurance for their patrons. Artemis Financial is seeking to add file verification step to their web application to ensure secure communications. 

What did you do particularly well in identifying their software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?

I identified a lot of vulnerabilities within the maven report and in turn suppressed all the vulnerabilities that were not critical. It is important to code securely so that users’ data in not compromised. Security is everyone’s responsibility. As a developer if we did not take security seriously peoples retirement plans, bank accounts, social security numbers, address and much more could be leaked just from this one company alone. Not to mention the other data points a financial company would be privileged to. Proper security adds an unprecedented feeling of safety to a  company’s clientele. Without proper security a financial company like Artemis Financial would go out of business because no one would trust that their information or data was secure.  

What about the process of working through the vulnerability assessment did you find challenging or helpful?

Going through the vulnerability assessment was helpful because I got to understand what valid or invalid threats to the system was.  Often critical threats could be resolved simply by updating the software. However, leaving these security protocols uncheck would leave the software vulnerable to attacks that the updates would prevent. 

How did you approach the need to increase layers of security? What techniques or strategies would you use in the future to assess vulnerabilities and determine mitigation techniques?

To increase they layers of security we added a Certificate Authority. We also used SHA-256 Cipher to make sure the data was encrypted properly and securely.

How did you ensure the code and software application were functional and secure? After refactoring code, how did you check to see whether you introduced new vulnerabilities?

To ensure that the software application was functional and secure I checked it on a https://localhost:8443/hash. Unfortunately I tried to get the URL secure for hours and us not successful in this attempt. My CA was signed by me, I could get the URL to display on my computer, however it was not secure. 

What resources, tools, or coding practices did you employ that you might find helpful in future assignments or tasks?
Employers sometimes ask for examples of work that you have successfully completed to demonstrate your skills, knowledge, and experience. What from this particular assignment might you want to showcase to a future employer?

The resources I used was gethub and stack overflow. However I also did research on my own to figure out a few speed bumps I came across along the was like changing the self-signed alias and deleting it. I would showcase my cipher and code to future employers. Because I was unable to get the https secure, I would want to work with someone one on one to figure it out.
