package ir.mservices.market.gateway.ui;

import defpackage.bl4;
import defpackage.js3;
import defpackage.r50;
import ir.mservices.market.version2.webapi.responsedto.GatewayDTO;

/* JADX INFO: loaded from: classes3.dex */
public interface GatewayItemAction extends r50 {

    public static final class SelectAction implements GatewayItemAction {
        private final GatewayDTO selectedAction;

        public SelectAction(GatewayDTO gatewayDTO) {
            js3.p(gatewayDTO, "selectedAction");
            this.selectedAction = gatewayDTO;
        }

        public static /* synthetic */ SelectAction copy$default(SelectAction selectAction, GatewayDTO gatewayDTO, int i, Object obj) {
            if ((i & 1) != 0) {
                gatewayDTO = selectAction.selectedAction;
            }
            return selectAction.copy(gatewayDTO);
        }

        public final GatewayDTO component1() {
            return this.selectedAction;
        }

        public final SelectAction copy(GatewayDTO gatewayDTO) {
            js3.p(gatewayDTO, "selectedAction");
            return new SelectAction(gatewayDTO);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectAction) && js3.i(this.selectedAction, ((SelectAction) obj).selectedAction);
        }

        public final GatewayDTO getSelectedAction() {
            return this.selectedAction;
        }

        public int hashCode() {
            return this.selectedAction.hashCode();
        }

        public String toString() {
            return "SelectAction(selectedAction=" + this.selectedAction + ")";
        }
    }

    public static final class SetMaxSpan implements GatewayItemAction {
        private final int maxSpan;

        public SetMaxSpan(int i) {
            this.maxSpan = i;
        }

        public static /* synthetic */ SetMaxSpan copy$default(SetMaxSpan setMaxSpan, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = setMaxSpan.maxSpan;
            }
            return setMaxSpan.copy(i);
        }

        public final int component1() {
            return this.maxSpan;
        }

        public final SetMaxSpan copy(int i) {
            return new SetMaxSpan(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetMaxSpan) && this.maxSpan == ((SetMaxSpan) obj).maxSpan;
        }

        public final int getMaxSpan() {
            return this.maxSpan;
        }

        public int hashCode() {
            return this.maxSpan;
        }

        public String toString() {
            return bl4.q(this.maxSpan, "SetMaxSpan(maxSpan=", ")");
        }
    }
}
