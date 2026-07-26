package ir.mservices.market.version2.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
@DatabaseTable(tableName = "DeactiveAppUpdate")
public final class InActiveAppUpdateModel {

    @DatabaseField(columnName = "isActive")
    private final boolean isActive;

    @DatabaseField(id = true)
    private final String packageName;

    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
    }

    public InActiveAppUpdateModel(String str, boolean z) {
        this.packageName = str;
        this.isActive = z;
    }

    public final String a() {
        return this.packageName;
    }

    public final boolean b() {
        return this.isActive;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InActiveAppUpdateModel)) {
            return false;
        }
        InActiveAppUpdateModel inActiveAppUpdateModel = (InActiveAppUpdateModel) obj;
        return js3.i(this.packageName, inActiveAppUpdateModel.packageName) && this.isActive == inActiveAppUpdateModel.isActive;
    }

    public final int hashCode() {
        return (this.packageName.hashCode() * 31) + (this.isActive ? 1231 : 1237);
    }

    public final String toString() {
        return "InActiveAppUpdateModel(packageName=" + this.packageName + ", isActive=" + this.isActive + ")";
    }

    public InActiveAppUpdateModel() {
        this("", true);
    }
}
