# This file details the progress of the security issues with this project

## Planning oversights & areas missed:
This was a very early project in my career as a software engineering student; so planning was not a majorly important step compared to learning the fundamentals of programming. With this being said, I didn't properly plan for invalid inputs or misuse of the software that would cause issues later on. Along with this, things like a license, backup policy, and computer security software were not at the front of the list for priorities. However, moving forward, I think I've learned some valuable insights into how planning for common situations like the ones solved in this project will better prepare for me future issues, along with giving me some handy resources in figuring out how to solve them. Specifically, 'Security' would be a top priority on the project planing checklist.

## Benefits of an online repository
This project was originally, and still is hosted through github.com. This brings some very beneficial bonuses such as access-control permissions, security, licensing options, and built-in backups. Although not all of the features are used, things like access-control permissions are a great help to allow me to make this repo 'public', meaning anyone can see it on my profile. This benefits me for proving my progress as a software engineer to others.

Another great resource github provides is a form of accounting or an archival system in the form of commits/changes to the repository over time along with the user associated with the change. This helps me see not only the progression & acitivity of the project, but I can also keep track of when a file was changed, and how it might be the problem I'm hunting for when debugging a change that happened X+ years ago. 

Licensing alone helps me protect this project as my intellecutal property & prohibits others from distributing it without a citation. Specifially, the GNU license used in this project prevents others from distributing altered versions of this software, ensuring verbatim copies alone exist. 

## Complete:
### Issue 1: Physical computer security
  - I've Updated my windows to the latest security update.
  - I've gone and purchased + installed Surfshark VPN + Antivirus (img shown below).
  - I've enabled bitlocker on windows & added TPM to ensure no 3rd party hardware has unathorized access.
  - I've added 2F to my microsoft accounts & authenticator app(s)
![image](https://user-images.githubusercontent.com/62121474/229658131-cc3f3917-dafe-472c-a445-f4b50f5154ba.png)

### Issue 2: Update third party libraries + Cleanup data leak with scan()     _commit id:_ b17bb8d
  - I've verified libraries are update-to-date, and don't break existing code.
  - I've added a try{} block around scan() to ensure data leak is cleaned up when finished.
  - **Bonus**: I unzipped the project so it's easier to clone & fork.

### Issue 4: Add License _commit id:_ 953c4da
  - I've added a GNU GPLv3 license to the project.
  - It was better structured for a academic project like this one & is something beyond just an MIT license.

### Issue 3: Add std unit testing with JUnit _commit id:_ ef3af2d
  - Added JUnit testing scripts & extracted files into packages
  - Tested 7 simple scenarios for the program functions
  - All test cases pass
These security tests help reinforce my confidence in the code, and prove it's integrity with handling differrent cases or unexpected scenarios.

### Issue 8: :bug: Handle invalid inputs such as strings _commit id:_ cb88bfc
  - According to feedback recieved by professor, nextLine(); is safer for getting input. However, this is difficult for handling integers, as you must capture the input as a string, then cast it to an int. Instead, I've used hasNextInt() to verify the input is the expected type (integer).
  - The program now does not allow any characters beyond 0-9.
  - You may still use `CTRL + C` to exit the program.

### Issue 7: Encapsulate/Extract program into separate files/classes _commit id:_ 62919dc
  - According to feedback recieved by professor, it's best practice to extract program logic into specific files & functions. So that's what this issue has solved.
  - I also documented the code pretty heavily so it's very easy to follow.

## In Progress:

### Issue 5: Accounting - log errors (MED | MODERATE)
  - Create a txt file, catch errors & write them to the file.

### Issue 6: Invest in/Improve backup policy (LOW | EASY)
  - Upload project(s) to backup harddrive, and even make a second github account with forked repos + start doing _releases_ with github.
