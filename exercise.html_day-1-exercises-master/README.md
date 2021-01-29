# My First Few Edits
* **Objective** - To create 4 independent webpages, each requiring specific features to be implemented.
* **Purpose** - To establish familiarity with basic HTML
* **Description**
    * You are provided with four different `html` template files in a `templates` directory at the root of this project.
    * Using the html tags that you already know, modify the html content so each individual file looks similar to their respective image.


### Part 1 - Clone the project
* Begin by _forking_ this project into a personal repository.
   * To do this, click the `Fork` button located at the top right of this page.
* Navigate to your github profile to find the _newly forked repository_.
* Clone the repository from **your account** into the `~/dev` directory.
   * `cd ~/dev`
   * `git clone https://www.github.com/{MYUSERNAME}/{PROJECTNAME}`
* Open the newly cloned project in a code editor (Visual Studio Code, for example).







### Part 2 - `syntax_template.html`

* Edit the `syntax_template.html` file to have the appropriate  _typographical emphasis_.
* Upon completion of edits navigate to the _root directory_ of your project from your `Git Bash` terminal. From the terminal, execute the following commands:
    * `git add .`
        * adds all of the file-changes in the current directory to _staging_.
            * **Tip:** execute `pwd` to view your _present working directory_
    * `git commit -m "finished edits on 'syntax_template.html' "`
        * saves _staged changes_ to local repository along with a brief description of changes made.
    * `git push -u origin master`
        * uploads local repository content to a remote repository.
* The edits should render a webpage which resembles the image below

<img src ="./instruction-images/syntax-template.png">








### Part 3 - `body_template.html`

* Edit the `body_template.html` file to have the appropriate  _heading tags_ as well as _typographical emphasis_.
* Upon completion of edits navigate to the _root directory_ of your project from your `Git Bash` terminal. From the terminal, execute the following commands:
    * `git add .`
    * `git commit -m "finished edits on 'body_template.html' "`
    * `git push -u origin master`
* The edits should render a webpage which resembles the image below

<img src ="./instruction-images/body-template.png">








### Part 4 - `models_template.html`

* Edit the `models_template.html` file to each of the following features:
    * _heading tag_
    * _typographical emphasis_
    * _hyperlink_ which references one of the other previously edited webpages.
        * **Bonus** - Implement a mechanism for opening link in _new tab_ upon being clicked.

* Upon completion of edits navigate to the _root directory_ of your project from your `Git Bash` terminal. From the terminal, execute the following commands:
    * `git add .`
    * `git commit -m "finished edits on 'models_template.html' "`
    * `git push -u origin master`

* The edits should render a webpage which resembles the image below

<img src ="./instruction-images/models-template.png">







### Part 5 - `headings_template.html`

* Edit the `headings_template.html` file to each of the following features:
    * _heading tag_
    * _typographical emphasis_
    * _HTML entities_
* Upon completion of edits navigate to the _root directory_ of your project from your `Git Bash` terminal. From the terminal, execute the following commands:
    * `git add .`
    * `git commit -m "finished edits on 'headings_template.html' "`
    * `git push -u origin master`

* The edits should render a webpage which resembles the image below

<img src ="./instruction-images/headings-template.png">






## How to Submit

#### Part 1 -  _Pushing_ local changes to remote repository
* from a _terminal_ navigate to the root directory of the _cloned_ project.
* from the root directory of the project, execute the following commands:
    * add all changes
      * `git add .`
    * commit changes to be pushed
      * `git commit -m 'I have added changes'`
    * push changes to your repository
      * `git push -u origin master`

#### Part 2 - Submitting assignment
* from the browser, navigate to the _forked_ project from **your** github account.
* click the `Pull Requests` tab.
* select `New Pull Request`
