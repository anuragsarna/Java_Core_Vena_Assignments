package Question_11;

public class Main {
    public static void main(String[] args) {
        CompanyAssetTracker tracker = new CompanyAssetTracker();

        tracker.addAsset("IT", new Asset("A001", "Laptop"));
        tracker.addAsset("HR", new Asset("A002", "Printer"));
        tracker.addAsset("IT", new Asset("A003", "Monitor"));
        tracker.addAsset("Finance", new Asset("A001", "Scanner")); // Duplicate ID

        tracker.printAssets();
    }
}

