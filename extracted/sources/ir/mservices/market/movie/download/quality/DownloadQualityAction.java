package ir.mservices.market.movie.download.quality;

import defpackage.bl4;
import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface DownloadQualityAction extends r50 {

    public static final class UpdateNotEnoughStorageFlow implements DownloadQualityAction {
        private final int quality;

        public UpdateNotEnoughStorageFlow(int i) {
            this.quality = i;
        }

        public static /* synthetic */ UpdateNotEnoughStorageFlow copy$default(UpdateNotEnoughStorageFlow updateNotEnoughStorageFlow, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = updateNotEnoughStorageFlow.quality;
            }
            return updateNotEnoughStorageFlow.copy(i);
        }

        public final int component1() {
            return this.quality;
        }

        public final UpdateNotEnoughStorageFlow copy(int i) {
            return new UpdateNotEnoughStorageFlow(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateNotEnoughStorageFlow) && this.quality == ((UpdateNotEnoughStorageFlow) obj).quality;
        }

        public final int getQuality() {
            return this.quality;
        }

        public int hashCode() {
            return this.quality;
        }

        public String toString() {
            return bl4.q(this.quality, "UpdateNotEnoughStorageFlow(quality=", ")");
        }
    }
}
