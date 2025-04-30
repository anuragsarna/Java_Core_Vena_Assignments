package Question_11;

import java.util.Objects;

class Asset {
    String assetId;
    String name;

    Asset(String assetId, String name) {
        this.assetId = assetId;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Asset)) return false;
        Asset asset = (Asset) o;
        return Objects.equals(assetId, asset.assetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetId);
    }

    @Override
    public String toString() {
        return "Asset{id='" + assetId + "', name='" + name + "'}";
    }
}

