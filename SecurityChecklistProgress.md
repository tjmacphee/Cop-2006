# This file details the progress of the security issues with this project

# Complete:
## Issue 1: Physical computer security
  - I've Updated my windows to the latest security update.
  - I've gone and purchased + installed Surfshark VPN + Antivirus (img shown below).
  - I've nabled bitlocker on windows & added TPM to ensure no 3rd party hardware has unathorized access.
  - I've added 2F to my microsoft accounts & authenticator app(s)
![image](https://user-images.githubusercontent.com/62121474/229658131-cc3f3917-dafe-472c-a445-f4b50f5154ba.png)

## Issue 2: Update third party libraries + Cleanup data leak with scan()     _commit id:_ b17bb8d
  - I've verified libraries are update-to-date, and don't break existing code.
  - I've added a try{} block around scan() to ensure data leak is cleaned up when finished.
  - **Bonus**: I unzipped the project so it's easier to clone & fork.

## Issue 4: Add License _commit id:_ 953c4da
  - I've added a GNU GPLv3 license to the project.
  - It was better structured for a academic project like this one & is something beyond just an MIT license.

## Issue 3: Add std unit testing with JUnit _commit id:_ ef3af2d
  - Added JUnit testing scripts & extracted files into packages
  - All test cases pass

## Issue 8: :bug: Handle invalid inputs such as strings _commit id:_ cb88bfc
  - According to feedback recieved by professor, nextLine(); is safer for getting input. However, this is difficult for handling integers, as you must capture the input as a string, then cast it to an int. Instead, I've used hasNextInt() to verify the input is the expected type (integer). 

## Issue 7: Encapsulate/Extract program into separate files/classes _commit id:_ 62919dc
  - According to feedback recieved by professor, it's best practice to extract program logic into specific files & functions. So that's what this issue has solved.
  - I also documented the code pretty heavily so it's very easy to follow.

# In Progress:

## Issue 5: Accounting - log errors (MED | MODERATE)
  - Create a txt file, catch errors & write them to the file.

## Issue 6: Invest in/Improve backup policy (LOW | EASY)
  - Upload project(s) to backup harddrive, and even make a second github account with forked repos + start doing _releases_ with github.
