package ir.mservices.market.common.data;

import defpackage.bl4;
import defpackage.js3;
import defpackage.o40;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public interface ErrorMessage {

    public static final class PlainText implements ErrorMessage {
        private final String text;

        public PlainText(String str) {
            js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
            this.text = str;
        }

        public static /* synthetic */ PlainText copy$default(PlainText plainText, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = plainText.text;
            }
            return plainText.copy(str);
        }

        public final String component1() {
            return this.text;
        }

        public final PlainText copy(String str) {
            js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
            return new PlainText(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PlainText) && js3.i(this.text, ((PlainText) obj).text);
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return o40.y("PlainText(text=", this.text, ")");
        }
    }

    public static final class Resource implements ErrorMessage {
        private final int resId;

        public Resource(int i) {
            this.resId = i;
        }

        public static /* synthetic */ Resource copy$default(Resource resource, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = resource.resId;
            }
            return resource.copy(i);
        }

        public final int component1() {
            return this.resId;
        }

        public final Resource copy(int i) {
            return new Resource(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Resource) && this.resId == ((Resource) obj).resId;
        }

        public final int getResId() {
            return this.resId;
        }

        public int hashCode() {
            return this.resId;
        }

        public String toString() {
            return bl4.q(this.resId, "Resource(resId=", ")");
        }
    }

    public static final class ResourceFormatted implements ErrorMessage {
        private final Object[] args;
        private final int resId;

        public ResourceFormatted(int i, Object[] objArr) {
            js3.p(objArr, "args");
            this.resId = i;
            this.args = objArr;
        }

        public static /* synthetic */ ResourceFormatted copy$default(ResourceFormatted resourceFormatted, int i, Object[] objArr, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = resourceFormatted.resId;
            }
            if ((i2 & 2) != 0) {
                objArr = resourceFormatted.args;
            }
            return resourceFormatted.copy(i, objArr);
        }

        public final int component1() {
            return this.resId;
        }

        public final Object[] component2() {
            return this.args;
        }

        public final ResourceFormatted copy(int i, Object[] objArr) {
            js3.p(objArr, "args");
            return new ResourceFormatted(i, objArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResourceFormatted)) {
                return false;
            }
            ResourceFormatted resourceFormatted = (ResourceFormatted) obj;
            return this.resId == resourceFormatted.resId && Arrays.equals(this.args, resourceFormatted.args);
        }

        public final Object[] getArgs() {
            return this.args;
        }

        public final int getResId() {
            return this.resId;
        }

        public int hashCode() {
            return Arrays.hashCode(this.args) + (this.resId * 31);
        }

        public String toString() {
            return "ResourceFormatted(resId=" + this.resId + ", args=" + Arrays.toString(this.args) + ")";
        }
    }
}
