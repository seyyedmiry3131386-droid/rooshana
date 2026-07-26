package ir.mservices.market.vpnService.adGuard.ui;

import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface AdGuardAction extends r50 {

    public static final class DisconnectActiveServiceAction implements AdGuardAction {
        public static final DisconnectActiveServiceAction INSTANCE = new DisconnectActiveServiceAction();

        private DisconnectActiveServiceAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DisconnectActiveServiceAction);
        }

        public int hashCode() {
            return 1821711816;
        }

        public String toString() {
            return "DisconnectActiveServiceAction";
        }
    }

    public static final class StartVpnAction implements AdGuardAction {
        public static final StartVpnAction INSTANCE = new StartVpnAction();

        private StartVpnAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof StartVpnAction);
        }

        public int hashCode() {
            return -1799991351;
        }

        public String toString() {
            return "StartVpnAction";
        }
    }

    public static final class ToggleVpnAction implements AdGuardAction {
        public static final ToggleVpnAction INSTANCE = new ToggleVpnAction();

        private ToggleVpnAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ToggleVpnAction);
        }

        public int hashCode() {
            return -1333113419;
        }

        public String toString() {
            return "ToggleVpnAction";
        }
    }
}
