*Version 2017-Fall-0.2, Revised 14 August 2017*
### *CS-443 01 --- Fall 2017*

<font color=red size=7>DRAFT</font><br>
<font color=red size=4>This is a draft version. It is subject to change until the first day of class on 7 September 2017.</font>

# CS-443 Software Quality Assurance and Testing

## Credit and Contact Hours
3 credits<br>
Lecture: 3 hours/week

## Catalog Course Description
> *Requirements analysis and test plan design. Testing strategies and techniques. Test coverage using statistical techniques. Code reviews and inspections.*

## Instructor
Dr. Karl R. Wurst<br>
See [http://cs.worcester.edu/kwurst/]() for contact information and schedule.

## Meeting Times and Location
TR 1:00-2:15pmm<br>
ST 107

## It's in the Syllabus
<span title="http://www.phdcomics.com/comics.php?f=1583"><a href=http://www.phdcomics.com/comics.php?f=1583><img src=http://www.phdcomics.com/comics/archive/phd051013s.gif alt="Cartoon about looking in the syllabus first before asking questions."></a></span>

**If you don't find the answer to your question in the syllabus, then please ask me.**

## Textbook
<table cellpadding="1" border="0">
<tbody>
<tr>
<td><img src="http://cs.worcester.edu/kwurst/img/9781466560680.jpg" width="110" /></td>
<td><em>Software Testing: A Craftsman’s Approach, Fourth Edition</em><br />
Paul C. Jorgensen<br />
CRC Press, 2013<br />
ISBN-13: 9781466560680<br /> 
<a target="_blank" href="https://www.crcpress.com/Software-Testing-A-Craftsmans-Approach-Fourth-Edition/Jorgensen/9781466560680">Textbook website</a></td>
</tr>
</tbody>
</table>

## Required Materials
In addition to the textbook, to successfully complete this course you will need:

1.	**Laptop Computer:** You will need a laptop computer that you can bring to class sessions and can use at home. The brand and operating system (Windows, Mac OS X, Linux) is unimportant – the software we will be using runs on all major operating systems and can be downloaded for free.  It is expected that you will download and install required software as needed over the course of the semester.
2.	**Internet Access:** You will need Internet access for access to:    
	1.	**Blackboard** – All course materials and announcements will be made available through the course site on Blackboard. Students will be required to use Blackboard as the course tool and be familiar with uploading files. 
	2. 	**WSU Gmail** – You must check your WSU Gmail account on a regular basis. 
	3. 	Version Control/Build/Test/Integration Sites and Tools – We will use sites such as GitHub, GitLab and Travis to host, build, and test our projects.  
	4.	**Tutorials and articles** – I will suggest, and you will research on your own, tutorials and articles for you to learn new technologies and techniques we need.

## Where Does This Course Lead?
* CS-448 – Software Development Capstone
* Your professional career

## Course Workload Expectations
***This is a three-credit course. You should expect to spend, on average, 9 hours per week on this class.***

You will spend 3 hours per week in class. In addition, you should expect to spend, on average, at least 6 hours per week during the semester outside of class. (See *Definition of the Credit Hour*)

## Definition of the Credit Hour
>Federal regulation defines a credit hour as an amount of work represented in intended learning outcomes and verified by evidence of student achievement that is an institutional established equivalence that reasonably approximates not less than –

>1.	One hour of classroom or direct faculty instruction and a minimum of two hours of out of class student work each week for approximately fifteen weeks for one semester or trimester hour of credit, or ten to twelve weeks for one quarter hour of credit, or the equivalent amount of work over a different amount of time; or 
2.	At least an equivalent amount of work as required in paragraph (1) of this definition for other academic activities as established by the institution including laboratory work, internships, practica, studio work, and other academic work leading to the award of credit hours.

>---New England Association of Schools and Colleges, Commission on Institutions of Higher Education, [Policy on Credits and Degrees](http://cihe.neasc.org/downloads/POLICIES/Pp111_PolicyOnCreditsAndDegrees.pdf)

## Prerequisites

This course has a prerequisite of CS-242 – Data Structures. I expect you to be able to read a problem specification, and read, trace, and understand procedural and object-oriented code. I expect that you have had experience using a unit-testing framework and developing a set of test cases for simple code. I expect that you have had experience using a version control system.

This course has a prerequisite of MA-150 – Statistics I or MA-302 – Probability and Statistics. I expect that you are able to be able to apply basic statistics and probability.

By this point you should have completed CS-225 – Discrete Structures I and CS-295 – Discrete Structures II (previously MA-220 and MA-290). I expect you to be comfortable with the topics of (and formal notations for) sets and their operations, functions and relations, propositional logic and logic operators, graphs (directed and undirected), and finite state machines.

I am also expecting that many of you will have taken CS-348 – Software Process Management, and have some understanding of the phases of the software lifecycle and are comfortable using a version control system.

***If you are missing any of this background, you should not take this course.***

## Course-Level Student Learning Outcomes
Upon successful completion of this course, students will be able to:

* Design and implement comprehensive test plans and analyze requirements to determine appropriate testing strategies
* Apply a wide variety of testing techniques in an effective and efficient manner
* Compute test coverage and yield according to a variety of criteria and use statistical techniques to evaluate defect density and likelihood of faults.
* Conduct reviews and effective, efficient inspections
* Assess a software process to evaluate how effective it is at promoting quality

## LASC Student Learning Outcomes
This course does not fulfill any LASC Content Area requirements, but contributes to the following Overarching Outcomes of LASC:

* Demonstrate effective oral and written communication.
* Employ quantitative and qualitative reasoning.
* Apply skills in critical thinking.
* Apply skills in information literacy.
* Understand the roles of science and technology in our modern world.
* Understand how scholars in various disciplines approach problems and construct knowledge.
* Display socially responsible behavior and act as socially responsible agents in the world.
* Make connections across courses and disciplines.

## Program-Level Student Learning Outcomes
This course addresses the following outcomes of the Computer Science Major:

Upon successful completion of the Major in Computer Science, students will be able to:

1.	Analyze a problem, develop/design multiple solutions and evaluate and document the solutions based on the requirements. (Mastery)
2.	Communicate effectively both in written and oral form. (Mastery)
3.	Identify professional and ethical considerations, and apply ethical reasoning to technological solutions to problems. (Mastery)
4.	Demonstrate an understanding of and appreciation for the importance of negotiation, effective work habits, leadership, and good communication with teammates and stakeholders. (Mastery)
5.	Learn new models, techniques, and technologies as they emerge and appreciate the necessity of such continuing professional development. (Mastery)

## Course Topics

* Terminiology - Error, Fault, Failure, Incident, Test, Test Case
* Test Cases
* Behavioral vs Structural Testing
* Specification-Based vs Code-Based Testing
* Black-Box vs. Gray-Box vs. White/Clear-Box Testing
* Levels of Testing - Unit, Integration, System
* Static vs. Dynamic Testing
* Review of Discrete Math - Set Theory, Functions, Relations, Propositional Logic, Probability Theory, Graph Theory
* Unit Testing
    * Specification-based - Boundary Value Testing, Equivalence Class Testing, Decision Table-Based Testing
    * Code-based - Path Testing, Data Flow Testing 
    * Code Coverage
    * JUnit
* Life Cycle-Based Testing
* Model-Based Testing
* Integration Testing
    * Mocking
* System Testing
* Object-Oriented Testing
* Software Complexity
* Test-Driven Development
* Test Case Evaluation
* Code Reviews
* Test Automation
* Testing Web Applications

## Grade Breakdown
Your grade in the course will be determined as follows: 

Assignment Category | Percentage
---|:-:
Attendance and Participation | 30%
Assignments | 30%
Exams | 30%
Self-Directed Reading Blog | 10%

## Grading Scale

Percentage | Letter Grade 
---|:-:
93-100% | A
90-93% | A-
87-90% | B+
83-87% | B
80-83% | B-
77-80% | C+
73-77% | C
70-73% | C-
67-70% | D+
63-67% | D
60-63% | D-
less than 60% | E 

Each range includes the lower value, but not the upper value. For example, the range of 80 to 83 includes all grades up to, but not including 83. The highest range does, however, include 100%.

## Attendance and Participation
You are expected to attend every class. Class time will be divided between lecture and hands-on, in-class, group work. Past experience has shown that students who do not attend class do not do as well on exams and projects.

The in-class work will give you a chance to apply the material from the lecture in an environment where you can benefit from the help of the instructor and your classmates. Once you have developed a level of comfort and confidence with the material, then you can be expected to apply it on larger assignments outside of class.

Missed in-class work cannot be made up after the fact. If you know that you will have to miss class, let me know beforehand and we can make arrangements for you to do the in-class work at another time.

## Assignments
The assignments will give you a chance to apply the material to larger tasks. The assignments will vary in what you will be asked to do - programming projects, written assignments, analysis, etc.

## Exams
We will have a midterm exam and a final exam.

The midterm is tentively scheduled to be given during class during the week of 17 October 20162016.

Our scheduled final exam period is Thursday, 15 December 2016, 12:30-3:30pm

## Self-Directed Reading Blog
Two of the CS Program-Level Student Learning Outcomes that this course addresses are:

> * Learn new models, techniques, and technologies as they emerge and appreciate the necessity of such continuing professional development. (Mastery)
> * Communicate effectively both in written and oral form. (Mastery)

You will be required to read outside blogs, articles, and/or books on your own and keep a blog about those readings that you found useful/interesting. Your blog must be publicly accessible[^1], and will be aggregated on the [CS@Worcester Blog](http://cs.worcester.edu/blog/).

We will also be keeping a list of resources for this class on the CS Department Wiki.

[^1]: If there is a reason why your name cannot be publicly associated with this course, you may blog under a pseudonym. You must see me to discuss the details, but your blog must still be publicly accessible and aggregated, and you must inform me of your pseudonym.

## Deliverables
All work will be submitted electronically through a variety of tools. The due date and time will be given on the assignment. The submission date and time will be determined by the submission timestamp of the tool used.

**Please do not submit assignments to me via email.** It is difficult for me to keep track of them and I often fail to remember that they are in my mailbox when it comes time to grade the assignment.

## Late Submissions
Late assignments will lose 10% of the maximum points per 24-hour period.

## Getting Help
If you are struggling with the material or a project please see me as soon as possible. Often a few minutes of individual attention is all that is needed to get you back on track.

By all means, try to work out the material on your own, but ask for help when you cannot do that in a reasonable amount of time. The longer you wait to ask for help, the harder it will be to catch up. 

**Asking for help or coming to see me during office hours is not bothering or annoying me. I am here to help you understand the material and be successful in the course.**

## Contacting Me
You may contact me by email (Karl.Wurst@worcester.edu), telephone (+1-508-929-8728), or see me in my office. My office hours are listed on the schedule on my web page ([http://cs.worcester.edu/kwurst/]()) or you may make an appointment for a mutually convenient time.

**If you email me, please include “[CS-443]” in the subject line, so that my email program can correctly file your email and ensure that your message does not get buried in my general mailbox.**

**If you email me from an account other than your Worcester State email, please be sure that your name appears somewhere in the email, so that I know who I am communicating with.** 

<span title="http://www.phdcomics.com/comics.php?f=1795"><a href=http://www.phdcomics.com/comics.php?f=1795><img src=http://www.phdcomics.com/comics/archive/phd042215s.gif alt="Cartoon with bad examples of how to send email to your instructor."></a></span>

You may expect that I will get back to you within 24 hours of your email or phone call (with the exception of weekends and holidays), although you will likely hear from me much sooner.

## Code of Conduct/Classroom Civility
All students are expected to adhere to the policies as outlined in the University's Student Code of Conduct (<a href="http://www.worcester.edu/CodeofConduct/" target="_blank">http://www.worcester.edu/CodeofConduct/</a>).

## Student Responsibilities 

* Contribute to a class atmosphere conducive to learning for everyone by asking/answering questions, participating in class discussions. Don’t just lurk!
* When working with a partner, participate actively. Don't let your partner do all the work - you won't learn anything that way.
* Seek help when necessary
* Start assignments as soon as they are posted.  Do not wait until the due date to seek help/to do the assignments
* Make use of the academic success center (see below)
* Expect to spend at least 9 hours of work per week on classwork.
* Each student is responsible for the contents of the textbook readings, handouts, and homework assignments.

## Student Accessibility Services
Worcester State University and this instructor are committed to the full participation of all students, and will provide accommodations for any student with documented disabilities who are registered with the Student Accessibility Services Office (SAS). Please contact the instructor as early as possible to discuss necessary accommodations. All information regarding disabilities will be treated with confidentiality. The SAS is located in the Administration Building, Room 131 and can be reached by phone (508-929-8733) or email (sas@worcester.edu). 

## Tutoring Services/Academic Success Center
Tutoring Services are offered through the [Academic Success Center](http://www.worcester.edu/SP-Academic-Success-Center/) (ASC).  The ASC is located on the first floor of the Administration building, A-130.  Tutoring services are provided to students FREE of charge.  Students seeking academic assistance should visit the center as soon as possible or contact the ASC at 508-929-8139

## The Math Center
The Math Center provides free assistance to students in Mathematics.  It is located on the first floor of the Sullivan Academic Building, S143.

## The Writing Center
The writing center provides free assistance to students in the areas of research and writing.  It is located on the third floor of the Sullivan Academic Building, S306.  To schedule an appointment, please call 508-929-8112 or email the Center at writingcenter@worcester.edu.  To find out more information about the Writing Center including the Center’s hours and the Center’s Online Writing Lab, visit their website at [www.worcester.edu/writing]()

## Worcester State Library
Worcester State Library has access to many articles through online databases including J-STOR. In addition many articles and book chapters are available to students through Inter-Library Loan (ILL).  With a little planning, ILL expands your ability to get credible information sources about topics you pursue in your course work.  Finally WSU students are free to use many of the library resources within the consortium. Given all of these resources it is extremely unlikely that you should have to pay for access to individual articles. Please work with the reference librarians to find the appropriate way to access materials you need.  You have already paid for these resources through your fees—please make use of them.

## Academic Conduct
Each student is responsible for the contents of the readings, discussions, class materials, textbook and handouts. All work must be done independently unless assigned as a group project. You may discuss assignments and materials with other students, but you should never share answers or files. **Everything that you turn in must be your own original work, unless specified otherwise in the assignment.**

Students may help each other understand the programming language and the development environment but students may not discuss actual solutions, design or implementation, to their programming assignments before they are submitted or share code or help each other debug their programming assignments. The assignments are the primary means used to teach the techniques and principles of computer programming; only by completing the programs individually will students receive the full benefit of the assignments. If you are looking at each other’s code before you submit your own, you are in violation of this policy. 

Students may not use solutions to assignments from any textbooks other than the text assigned for the course, or from any person other than the instructor, or from any Internet site, or from any other source not specifically allowed by the instructor. If a student copies code from an unauthorized source and submits it as a solution to an assignment, the student will receive a 0 for that assignment.

**Any inappropriate sharing of work or use of another's work without attribution will result in a grade of zero on that assignment for all parties involved. If you do so a second time, you will receive an “E” for the course.**

Academic integrity is an essential component of a Worcester State education. Education is both the acquisition of knowledge and the development of skills that lead to further intellectual development. Faculty are expected to follow strict principles of intellectual honesty in their own scholarship; students are held to the same standard. Only by doing their own work can students gain the knowledge, skills, confidence and self-worth that come from earned success; only by learning how to gather information, to integrate it and to communicate it effectively, to identify an idea and follow it to its logical conclusion can they develop the habits of mind characteristic of educated citizens. Taking shortcuts to higher or easier grades results in a Worcester State experience that is intellectually bankrupt.

Academic integrity is important to the integrity of the Worcester State community as a whole. If Worcester State awards degrees to students who have not truly earned them, a reputation for dishonesty and incompetence will follow all of our graduates. Violators cheat their classmates out of deserved rewards and recognition. Academic dishonesty debases the institution and demeans the degree from that institution.  

It is in the interest of students, faculty, and administrators to recognize the importance of academic integrity and to ensure that academic standards at Worcester State remain strong. Only by maintaining high standards of academic honesty can we protect the value of the educational process and the credibility of the institution and its graduates in the larger community.

**You should familiarize yourself with Worcester State College's Academic Honesty policy. The policy outlines what constitutes academic dishonesty, what sanctions may be imposed and the procedure for appealing a decision. The complete Academic Honesty Policy appears in: <a href="http://www.worcester.edu/CodeofConduct/" target="_blank">http://www.worcester.edu/CodeofConduct/</a>**

**If you have a serious problem that prevents you from finishing an assignment on time, contact me and we'll come up with a solution.**

## Student Work Retention Policy
It is my policy to securely dispose of student work one calendar year after grades have been submitted for a course.

## Schedule
**This schedule is subject to change.**

Week | Tuesday | Thursday
:-: | :-: | :-:1 | 5 September 2017<br>**No Class**<br>Pre-College Conference | 7 September 2017<br>*Part I: A Mathematical Context*<br>Chapter 1 
2 | 12 September 2017<br>*Part I: A Mathematical Context*<br>Chapters 2, 3, and 4 | 14 September 2017<br>*Part II: Unit Testing*<br>Chapter 53 | 19 September 2017<br>*Part II: Unit Testing*<br>Chapters 5, 6 | 21 September 2017<br>*Part II: Unit Testing*<br>Chapter 6
4 | 26 September 2017<br>*Part II: Unit Testing*<br>Chapter 7 | 28 September 2017<br>*Part II: Unit Testing*<br>Chapters 7, 8
5 | 3 October 2017<br>*Part II: Unit Testing*<br>Chapter 8 | 5 October 2017<br>*Part II: Unit Testing*<br>Chapter 9
6 | 10 October 2017<br>**No Class**<br>I will be away | 12 October 2017<br>*Part II: Unit Testing*<br>Chapter 10
7 | 17 October 2017<br>**Midterm Exam** | 19 October 2017<br>*Part III: Beyond Unit Testing*<br>Chapters 11, 12
8 | 24 October 2017<br>*Part III: Beyond Unit Testing*<br>Chapter 13 | 26 October 2017<br>*Part III: Beyond Unit Testing*<br>Chapter 13
9 | 31 October 2017<br>*Part III: Beyond Unit Testing*<br>Chapter 14 | 2 November 2017<br>*Part III: Beyond Unit Testing*<br>Chapters 14, 15
10 | 7 November 2017<br>*Part III: Beyond Unit Testing*<br>Chapter 15 | 9 November 2017<br>*Part III: Beyond Unit Testing*<br>Chapter 16
11 | 14 November 2017<br>*Part III: Beyond Unit Testing*<br>Chapter 17 | 16 November 2017<br>*Part III: Beyond Unit Testing*<br>Chapter 18, 19
12 | 21 November 2017<br>*Part III: Beyond Unit Testing*<br>Chapter 19 | 23 November 2017<br>**No Class**<br>Thanksgiving Recess
13 | 28 November 2017<br>*Part III: Beyond Unit Testing*<br>Chapters 20, 21 | 30 November 2017<br>*Part III: Beyond Unit Testing*<br>Chapter 22
14 | 5 December 2017<br>*Part III: Beyond Unit Testing*<br>Chapter 22 | 7 December 2017<br>*Part III: Beyond Unit Testing*<br>Chapter 23
Final Exams | | 14 December 2017<br>**Final Exam**<br>12:30-3:30am

##Copyright and License
####&copy; 2016 Karl R. Wurst, Worcester State University

<img src="http://mirrors.creativecommons.org/presskit/buttons/88x31/png/by-sa.png" width=100px/>This work is licensed under the Creative Commons Attribution-ShareAlike 4.0 International License. To view a copy of this license, visit [http://creativecommons.org/licenses/by-sa/4.0/]() or send a letter to Creative Commons, 444 Castro Street, Suite 900, Mountain View, California, 94041, USA.