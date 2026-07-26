package j$.time;

import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w implements Serializable {
    private static final long serialVersionUID = 8352817235686L;

    public abstract j$.time.zone.f C();

    public abstract void F(DataOutput dataOutput);

    public abstract String h();

    static {
        Map.Entry[] entryArr = {j$.com.android.tools.r8.a.O("ACT", "Australia/Darwin"), j$.com.android.tools.r8.a.O("AET", "Australia/Sydney"), j$.com.android.tools.r8.a.O("AGT", "America/Argentina/Buenos_Aires"), j$.com.android.tools.r8.a.O("ART", "Africa/Cairo"), j$.com.android.tools.r8.a.O("AST", "America/Anchorage"), j$.com.android.tools.r8.a.O("BET", "America/Sao_Paulo"), j$.com.android.tools.r8.a.O("BST", "Asia/Dhaka"), j$.com.android.tools.r8.a.O("CAT", "Africa/Harare"), j$.com.android.tools.r8.a.O("CNT", "America/St_Johns"), j$.com.android.tools.r8.a.O("CST", "America/Chicago"), j$.com.android.tools.r8.a.O("CTT", "Asia/Shanghai"), j$.com.android.tools.r8.a.O("EAT", "Africa/Addis_Ababa"), j$.com.android.tools.r8.a.O("ECT", "Europe/Paris"), j$.com.android.tools.r8.a.O("IET", "America/Indiana/Indianapolis"), j$.com.android.tools.r8.a.O("IST", "Asia/Kolkata"), j$.com.android.tools.r8.a.O("JST", "Asia/Tokyo"), j$.com.android.tools.r8.a.O("MIT", "Pacific/Apia"), j$.com.android.tools.r8.a.O("NET", "Asia/Yerevan"), j$.com.android.tools.r8.a.O("NST", "Pacific/Auckland"), j$.com.android.tools.r8.a.O("PLT", "Asia/Karachi"), j$.com.android.tools.r8.a.O("PNT", "America/Phoenix"), j$.com.android.tools.r8.a.O("PRT", "America/Puerto_Rico"), j$.com.android.tools.r8.a.O("PST", "America/Los_Angeles"), j$.com.android.tools.r8.a.O("SST", "Pacific/Guadalcanal"), j$.com.android.tools.r8.a.O("VST", "Asia/Ho_Chi_Minh"), j$.com.android.tools.r8.a.O("EST", "-05:00"), j$.com.android.tools.r8.a.O("MST", "-07:00"), j$.com.android.tools.r8.a.O("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i = 0; i < 28; i++) {
            Map.Entry entry = entryArr[i];
            Object objRequireNonNull = Objects.requireNonNull(entry.getKey());
            if (map.put(objRequireNonNull, Objects.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + objRequireNonNull);
            }
        }
        Collections.unmodifiableMap(map);
    }

    public static w D(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.a != 0) {
            str = str.concat(zoneOffset.b);
        }
        return new x(str, zoneOffset.C());
    }

    public static w E(String str, int i) {
        String strSubstring = str.substring(0, i);
        if (str.length() == i) {
            return D(strSubstring, ZoneOffset.UTC);
        }
        if (str.charAt(i) != '+' && str.charAt(i) != '-') {
            return x.G(str);
        }
        try {
            ZoneOffset zoneOffsetG = ZoneOffset.G(str.substring(i));
            if (zoneOffsetG == ZoneOffset.UTC) {
                return D(strSubstring, zoneOffsetG);
            }
            return D(strSubstring, zoneOffsetG);
        } catch (b e) {
            throw new b("Invalid ID for offset-based ZoneId: ".concat(str), e);
        }
    }

    public w() {
        if (getClass() != ZoneOffset.class && getClass() != x.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            return h().equals(((w) obj).h());
        }
        return false;
    }

    public int hashCode() {
        return h().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return h();
    }

    private Object writeReplace() {
        return new r((byte) 7, this);
    }
}
