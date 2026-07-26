package ir.mservices.market.version2.webapi.responsedto;

import defpackage.f88;
import defpackage.js3;
import defpackage.lw;
import defpackage.vi0;
import defpackage.vo7;
import defpackage.yd1;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoRowDto implements Serializable {

    @vo7("aparatId")
    private final String aparatId;

    @vo7("application")
    private final ApplicationDTO application;

    @vo7("bgUrl")
    private final String bgUrl;

    @vo7("height")
    private final int height;

    @vo7("startCallbackUrl")
    private final String startCallbackUrl;

    @vo7("thumbnailUrl")
    private final String thumbnailUrl;

    @vo7("videoUrl")
    private final String videoUrl;

    @vo7("width")
    private final int width;

    public VideoRowDto(String str, String str2, ApplicationDTO applicationDTO, String str3, String str4, int i, int i2, String str5) {
        this.bgUrl = str;
        this.videoUrl = str2;
        this.application = applicationDTO;
        this.aparatId = str3;
        this.startCallbackUrl = str4;
        this.width = i;
        this.height = i2;
        this.thumbnailUrl = str5;
    }

    public final String getAparatId() {
        return this.aparatId;
    }

    public final ApplicationDTO getApplication() {
        return this.application;
    }

    public final String getBgUrl() {
        return this.bgUrl;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getId() {
        String str;
        String str2 = this.videoUrl;
        if (str2 == null || f88.n0(str2)) {
            String str3 = this.aparatId;
            if (str3 == null || f88.n0(str3)) {
                lw.g(null, "One of aparatId or videoUrl must be valid", null);
                return "";
            }
            str = this.aparatId;
        } else {
            str = this.videoUrl;
        }
        try {
            js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            Charset charsetForName = Charset.forName("iso-8859-1");
            js3.o(charsetForName, "forName(...)");
            byte[] bytes = str.getBytes(charsetForName);
            js3.o(bytes, "getBytes(...)");
            messageDigest.update(bytes, 0, str.length());
            byte[] bArrDigest = messageDigest.digest();
            js3.o(bArrDigest, "digest(...)");
            return vi0.a(bArrDigest, false);
        } catch (Exception unused) {
            lw.g(null, "NoSuchAlgorithmException | UnsupportedEncodingException", null);
            return null;
        }
    }

    public final String getStartCallbackUrl() {
        return this.startCallbackUrl;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ VideoRowDto(String str, String str2, ApplicationDTO applicationDTO, String str3, String str4, int i, int i2, String str5, int i3, yd1 yd1Var) {
        String str6;
        int i4;
        i = (i3 & 32) != 0 ? 0 : i;
        if ((i3 & 64) != 0) {
            str6 = str5;
            i4 = 0;
        } else {
            str6 = str5;
            i4 = i2;
        }
        this(str, str2, applicationDTO, str3, str4, i, i4, str6);
    }
}
