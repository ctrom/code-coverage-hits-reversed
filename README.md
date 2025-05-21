The Main class is set up with a single method that contains an if statement that should always evaluate to true.

After running the test case in MainSpec.groovy with coverage:

![image](https://github.com/user-attachments/assets/d988078e-445c-4f9d-83ae-392153293481)

The coverage data in the editor shows that `list.isEmpty()` has had false hits and no true hits:

![image](https://github.com/user-attachments/assets/db546d52-f365-4d22-9850-b8d2478919f8)

But the coverage data also shows that the code inside the if block has run, suggesting that the if statement actually evaluated to true:

![image](https://github.com/user-attachments/assets/d34811d1-a553-47ed-a6c8-9c917f1037cc)

