package ir.mservices.market.version2.webapi.requestdto;

import android.text.TextUtils;
import defpackage.js3;
import defpackage.lw;
import defpackage.vi0;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AuthorizeRequestDto implements RequestDTO {
    private String acId;
    private String acKey;
    private String adId;
    private String andId;
    private String api;
    private String brand;
    private float dens;
    private String deviceModel;
    private String deviceName;
    private String deviceType;
    private String dsize;
    private String hsh;
    private String imei;
    private String imsi;
    private String manufacturer;
    private MiuiRequestDto miui;
    private String product;
    private List<String> supportedAbis;
    private String uuid;

    public String getHash() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.andId);
        sb.append(this.api);
        sb.append(this.imei);
        sb.append(this.imsi);
        sb.append(this.dens);
        sb.append(this.acId);
        sb.append(this.dsize);
        sb.append(this.brand);
        sb.append(this.manufacturer);
        sb.append(this.deviceModel);
        sb.append(this.deviceName);
        sb.append(this.product);
        sb.append(this.uuid);
        sb.append(this.adId);
        sb.append(this.acKey);
        List<String> list = this.supportedAbis;
        sb.append(list == null ? "" : TextUtils.join(",", list));
        String string = sb.toString();
        try {
            js3.p(string, ConfirmDTO.INPUT_TYPE_TEXT);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            Charset charsetForName = Charset.forName("iso-8859-1");
            js3.o(charsetForName, "forName(...)");
            byte[] bytes = string.getBytes(charsetForName);
            js3.o(bytes, "getBytes(...)");
            messageDigest.update(bytes, 0, string.length());
            byte[] bArrDigest = messageDigest.digest();
            js3.o(bArrDigest, "digest(...)");
            return vi0.a(bArrDigest, false);
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            lw.g(e, "SHA1 is not found", null);
            return "";
        }
    }

    public void setAcId(String str) {
        this.acId = str;
    }

    public void setAcKey(String str) {
        this.acKey = str;
    }

    public void setAdId(String str) {
        this.adId = str;
    }

    public void setAndId(String str) {
        this.andId = str;
    }

    public void setApi(String str) {
        this.api = str;
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public void setDens(float f) {
        this.dens = f;
    }

    public void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setDsize(String str) {
        this.dsize = str;
    }

    public void setHsh(String str) {
        this.hsh = str;
    }

    public void setImei(String str) {
        this.imei = str;
    }

    public void setImsi(String str) {
        this.imsi = str;
    }

    public void setManufacturer(String str) {
        this.manufacturer = str;
    }

    public void setMiui(MiuiRequestDto miuiRequestDto) {
        this.miui = miuiRequestDto;
    }

    public void setProduct(String str) {
        this.product = str;
    }

    public void setSupportedAbis(List<String> list) {
        this.supportedAbis = list;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }
}
