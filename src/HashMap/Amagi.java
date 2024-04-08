/*
You are given a list of test cases, each represented by a tuple (test_case_name, execution_time), where test_case_name is a string,
and execution_time is an
integer representing the time (in minutes) it takes to execute the test case.

You need to write a function to select a subset of test cases in such a way that-
a. their total execution time does not exceed a given threshold max_execution_time, while maximising the number of selected test cases.
Write a function called select_test_cases(test_cases, max_execution_time) that takes in the list of test cases
and the maximum execution time constraint and returns a list of selected test case names.

You should aim to `select as many test cases as possible` without exceeding the execution time constraint.
Example 0

test_cases = [ ("Test1", 10),
("Test2", 15),
("Test3", 5),
("Test4", 8),
("Test5", 20),
        ]

max_execution_time = 30
selected_test_cases = select_test_cases(test_cases, max_execution_time)
print(selected_test_cases)
# output
[ ['Test1', 'Test3', 'Test4'] ,  ['test2,test3,test4] ,  [ test1,test2,test3] ]
*/


package HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Amagi {

        public static List<List<String>> selectTestCases(List<Test> testCases, int maxExecutionTime) {
            // Sort the test cases based on their execution time in ascending order
            Collections.sort(testCases, Comparator.comparingInt(Test::getExecutionTime));

            List<List<String>> selectedTestCases = new ArrayList<>();
            List<String> currentTestSelection = new ArrayList<>();
            int totalExecutionTime = 0;

            // Iterate through the sorted test cases and select as many as possible without exceeding maxExecutionTime
            for (Test test : testCases) {
                if (totalExecutionTime + test.getExecutionTime() <= maxExecutionTime) {
                    currentTestSelection.add(test.getName());
                    totalExecutionTime += test.getExecutionTime();
                } else {
                    selectedTestCases.add(new ArrayList<>(currentTestSelection));
                    currentTestSelection.clear();
                    totalExecutionTime = 0;
                }
            }

            // Add the remaining selected test cases if any
            if (!currentTestSelection.isEmpty()) {
                selectedTestCases.add(new ArrayList<>(currentTestSelection));
            }

            return selectedTestCases;
        }

        public static void main(String[] args) {
            List<Test> testCases = new ArrayList<>();
            testCases.add(new Test("Test1", 10));
            testCases.add(new Test("Test2", 15));
            testCases.add(new Test("Test3", 5));
            testCases.add(new Test("Test4", 8));
            testCases.add(new Test("Test5", 20));

            int maxExecutionTime = 30;
            List<List<String>> selectedTestCases = selectTestCases(testCases, maxExecutionTime);
            for (List<String> testCaseGroup : selectedTestCases) {
                System.out.println(testCaseGroup);
            }
        }

        static class Test {
            private String name;
            private int executionTime;

            public Test(String name, int executionTime) {
                this.name = name;
                this.executionTime = executionTime;
            }

            public String getName() {
                return name;
            }

            public int getExecutionTime() {
                return executionTime;
            }
        }
    }

