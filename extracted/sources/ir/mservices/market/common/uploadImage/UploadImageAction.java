package ir.mservices.market.common.uploadImage;

import defpackage.js3;
import defpackage.o40;
import defpackage.r50;
import defpackage.yd1;

/* JADX INFO: loaded from: classes3.dex */
public interface UploadImageAction extends r50 {

    public static final class ImagePathAction implements UploadImageAction {
        private final String path;

        /* JADX WARN: Multi-variable type inference failed */
        public ImagePathAction() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ImagePathAction copy$default(ImagePathAction imagePathAction, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = imagePathAction.path;
            }
            return imagePathAction.copy(str);
        }

        public final String component1() {
            return this.path;
        }

        public final ImagePathAction copy(String str) {
            return new ImagePathAction(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ImagePathAction) && js3.i(this.path, ((ImagePathAction) obj).path);
        }

        public final String getPath() {
            return this.path;
        }

        public int hashCode() {
            String str = this.path;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return o40.y("ImagePathAction(path=", this.path, ")");
        }

        public ImagePathAction(String str) {
            this.path = str;
        }

        public /* synthetic */ ImagePathAction(String str, int i, yd1 yd1Var) {
            this((i & 1) != 0 ? null : str);
        }
    }

    public static final class SubscriberIdAction implements UploadImageAction {
        private final String id;

        public SubscriberIdAction(String str) {
            js3.p(str, "id");
            this.id = str;
        }

        public static /* synthetic */ SubscriberIdAction copy$default(SubscriberIdAction subscriberIdAction, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = subscriberIdAction.id;
            }
            return subscriberIdAction.copy(str);
        }

        public final String component1() {
            return this.id;
        }

        public final SubscriberIdAction copy(String str) {
            js3.p(str, "id");
            return new SubscriberIdAction(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubscriberIdAction) && js3.i(this.id, ((SubscriberIdAction) obj).id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return o40.y("SubscriberIdAction(id=", this.id, ")");
        }
    }
}
