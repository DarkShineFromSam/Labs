package Arhitektura.Task7OK.Task3;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final String name;
    private final List<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public List<Branch> getBranches() {
        return this.branches;
    }

    public void addBranch(Branch branch) {
        this.branches.add(branch);
    }

    public void removeBranch(Branch branch) {
        this.branches.remove(branch);
    }

    public void findDepositByName(String depositorName) {
        for (Branch branch : branches) {
            Deposit deposit = branch.getDeposit(depositorName);


            if (deposit != null) {
                String branchName = branch.getName();

                System.out.println(branchName + " | " + deposit.getName() + " | " + deposit.getDeposit());
            }
        }
    }
}
