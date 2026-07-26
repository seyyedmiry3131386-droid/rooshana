package okhttp3;

import defpackage.rl3;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Protocol {
    public static final rl3 b;
    public static final Protocol c;
    public static final Protocol d;
    public static final Protocol e;
    public static final Protocol f;
    public static final Protocol g;
    public static final Protocol h;
    public static final Protocol i;
    public static final /* synthetic */ Protocol[] j;
    public final String a;

    static {
        Protocol protocol = new Protocol("HTTP_1_0", 0, "http/1.0");
        c = protocol;
        Protocol protocol2 = new Protocol("HTTP_1_1", 1, "http/1.1");
        d = protocol2;
        Protocol protocol3 = new Protocol("SPDY_3", 2, "spdy/3.1");
        e = protocol3;
        Protocol protocol4 = new Protocol("HTTP_2", 3, "h2");
        f = protocol4;
        Protocol protocol5 = new Protocol("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        g = protocol5;
        Protocol protocol6 = new Protocol("QUIC", 5, "quic");
        h = protocol6;
        Protocol protocol7 = new Protocol("HTTP_3", 6, "h3");
        i = protocol7;
        Protocol[] protocolArr = {protocol, protocol2, protocol3, protocol4, protocol5, protocol6, protocol7};
        j = protocolArr;
        a.a(protocolArr);
        b = new rl3();
    }

    public Protocol(String str, int i2, String str2) {
        this.a = str2;
    }

    public static Protocol valueOf(String str) {
        return (Protocol) Enum.valueOf(Protocol.class, str);
    }

    public static Protocol[] values() {
        return (Protocol[]) j.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
