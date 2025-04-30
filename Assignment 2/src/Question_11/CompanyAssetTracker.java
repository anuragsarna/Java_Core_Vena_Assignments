package Question_11;
import java.util.*;

public class CompanyAssetTracker {
    private final Map<String, Set<Asset>> departmentAssets = new HashMap<>();
    private final Set<String> globalAssetIds = new HashSet<>();

    public boolean addAsset(String department, Asset asset) {
        if (globalAssetIds.contains(asset.assetId)) {
            System.out.println("Duplicate asset ID detected: " + asset.assetId);
            return false;
        }

        departmentAssets.putIfAbsent(department, new HashSet<>());
        departmentAssets.get(department).add(asset);
        globalAssetIds.add(asset.assetId);
        return true;
    }

    public void printAssets() {
        for (String dept : departmentAssets.keySet()) {
            System.out.println("Department: " + dept);
            for (Asset asset : departmentAssets.get(dept)) {
                System.out.println("  " + asset);
            }
        }
    }
}
