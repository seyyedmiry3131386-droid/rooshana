package ir.mservices.market.activity;

import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface BaseNavigationContentAction extends r50 {

    public static final class ClearInstallPermissionEventAction implements BaseNavigationContentAction {
        public static final ClearInstallPermissionEventAction INSTANCE = new ClearInstallPermissionEventAction();

        private ClearInstallPermissionEventAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ClearInstallPermissionEventAction);
        }

        public int hashCode() {
            return -796932614;
        }

        public String toString() {
            return "ClearInstallPermissionEventAction";
        }
    }
}
