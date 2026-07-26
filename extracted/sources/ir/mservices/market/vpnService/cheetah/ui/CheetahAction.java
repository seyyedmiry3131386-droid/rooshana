package ir.mservices.market.vpnService.cheetah.ui;

import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface CheetahAction extends r50 {

    public static final class AppStatusClickAction implements CheetahAction {
        public static final AppStatusClickAction INSTANCE = new AppStatusClickAction();

        private AppStatusClickAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AppStatusClickAction);
        }

        public int hashCode() {
            return 1233537004;
        }

        public String toString() {
            return "AppStatusClickAction";
        }
    }

    public static final class DisconnectActiveServiceAction implements CheetahAction {
        public static final DisconnectActiveServiceAction INSTANCE = new DisconnectActiveServiceAction();

        private DisconnectActiveServiceAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DisconnectActiveServiceAction);
        }

        public int hashCode() {
            return -1892111032;
        }

        public String toString() {
            return "DisconnectActiveServiceAction";
        }
    }

    public static final class ShouldLaunchAppAction implements CheetahAction {
        public static final ShouldLaunchAppAction INSTANCE = new ShouldLaunchAppAction();

        private ShouldLaunchAppAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ShouldLaunchAppAction);
        }

        public int hashCode() {
            return 329444784;
        }

        public String toString() {
            return "ShouldLaunchAppAction";
        }
    }

    public static final class StartVpnAction implements CheetahAction {
        public static final StartVpnAction INSTANCE = new StartVpnAction();

        private StartVpnAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof StartVpnAction);
        }

        public int hashCode() {
            return -598364087;
        }

        public String toString() {
            return "StartVpnAction";
        }
    }

    public static final class ToggleVpnAction implements CheetahAction {
        public static final ToggleVpnAction INSTANCE = new ToggleVpnAction();

        private ToggleVpnAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ToggleVpnAction);
        }

        public int hashCode() {
            return 1557593397;
        }

        public String toString() {
            return "ToggleVpnAction";
        }
    }
}
