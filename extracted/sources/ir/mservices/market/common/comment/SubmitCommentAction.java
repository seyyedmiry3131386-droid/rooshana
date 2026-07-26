package ir.mservices.market.common.comment;

import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface SubmitCommentAction extends r50 {

    public static final class UpdateRateState implements SubmitCommentAction {
        private final float rate;

        public UpdateRateState(float f) {
            this.rate = f;
        }

        public static /* synthetic */ UpdateRateState copy$default(UpdateRateState updateRateState, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = updateRateState.rate;
            }
            return updateRateState.copy(f);
        }

        public final float component1() {
            return this.rate;
        }

        public final UpdateRateState copy(float f) {
            return new UpdateRateState(f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateRateState) && Float.compare(this.rate, ((UpdateRateState) obj).rate) == 0;
        }

        public final float getRate() {
            return this.rate;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.rate);
        }

        public String toString() {
            return "UpdateRateState(rate=" + this.rate + ")";
        }
    }
}
