package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.SentryLevel;
import io.sentry.h3;
import io.sentry.rrweb.RRWebEventType;
import io.sentry.rrweb.RRWebIncrementalSnapshotEvent$IncrementalSource;
import io.sentry.rrweb.RRWebInteractionEvent$InteractionType;
import io.sentry.s1;
import io.sentry.u0;
import io.sentry.vendor.gson.stream.JsonToken;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements s1 {
    public final /* synthetic */ int a;

    public /* synthetic */ b0(int i) {
        this.a = i;
    }

    public static io.sentry.rrweb.a b(h3 h3Var, u0 u0Var) {
        String strM0;
        h3Var.P0();
        io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
        HashMap map = null;
        while (h3Var.peek() == JsonToken.NAME) {
            String strM02 = h3Var.m0();
            strM02.getClass();
            if (strM02.equals("data")) {
                h3Var.P0();
                ConcurrentHashMap concurrentHashMap = null;
                while (h3Var.peek() == JsonToken.NAME) {
                    String strM03 = h3Var.m0();
                    strM03.getClass();
                    if (strM03.equals("payload")) {
                        h3Var.P0();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (h3Var.peek() == JsonToken.NAME) {
                            strM0 = h3Var.m0();
                            strM0.getClass();
                            switch (strM0) {
                                case "data":
                                    ConcurrentHashMap concurrentHashMapQ = io.sentry.config.a.Q((Map) h3Var.O0());
                                    if (concurrentHashMapQ == null) {
                                        break;
                                    } else {
                                        aVar.i = concurrentHashMapQ;
                                        break;
                                    }
                                    break;
                                case "type":
                                    aVar.e = h3Var.S();
                                    break;
                                case "category":
                                    aVar.f = h3Var.S();
                                    break;
                                case "timestamp":
                                    aVar.d = h3Var.nextDouble();
                                    break;
                                case "level":
                                    try {
                                        aVar.h = SentryLevel.valueOf(h3Var.t().toUpperCase(Locale.ROOT));
                                        break;
                                    } catch (Exception e) {
                                        u0Var.e(SentryLevel.DEBUG, e, "Error when deserializing SentryLevel", new Object[0]);
                                        break;
                                    }
                                    break;
                                case "message":
                                    aVar.g = h3Var.S();
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    h3Var.H(u0Var, concurrentHashMap2, strM0);
                                    break;
                            }
                        }
                        aVar.k = concurrentHashMap2;
                        h3Var.t0();
                    } else if (strM03.equals("tag")) {
                        String strS = h3Var.S();
                        if (strS == null) {
                            strS = "";
                        }
                        aVar.c = strS;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        h3Var.H(u0Var, concurrentHashMap, strM03);
                    }
                }
                aVar.l = concurrentHashMap;
                h3Var.t0();
            } else if (strM02.equals("type")) {
                RRWebEventType rRWebEventType = (RRWebEventType) h3Var.M0(u0Var, new b0(10));
                io.sentry.config.a.W(rRWebEventType, "");
                aVar.a = rRWebEventType;
            } else if (strM02.equals("timestamp")) {
                aVar.b = h3Var.nextLong();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                h3Var.H(u0Var, map, strM02);
            }
        }
        aVar.j = map;
        h3Var.t0();
        return aVar;
    }

    public static io.sentry.rrweb.d c(h3 h3Var, u0 u0Var) {
        String strM0;
        h3Var.P0();
        io.sentry.rrweb.d dVar = new io.sentry.rrweb.d();
        HashMap map = null;
        while (h3Var.peek() == JsonToken.NAME) {
            String strM02 = h3Var.m0();
            strM02.getClass();
            if (strM02.equals("data")) {
                h3Var.P0();
                HashMap map2 = null;
                while (h3Var.peek() == JsonToken.NAME) {
                    strM0 = h3Var.m0();
                    strM0.getClass();
                    switch (strM0) {
                        case "x":
                            dVar.f = h3Var.nextFloat();
                            break;
                        case "y":
                            dVar.g = h3Var.nextFloat();
                            break;
                        case "id":
                            dVar.e = h3Var.nextInt();
                            break;
                        case "type":
                            dVar.d = (RRWebInteractionEvent$InteractionType) h3Var.M0(u0Var, new b0(13));
                            break;
                        case "pointerType":
                            dVar.h = h3Var.nextInt();
                            break;
                        case "pointerId":
                            dVar.i = h3Var.nextInt();
                            break;
                        default:
                            if (!strM0.equals("source")) {
                                if (map2 == null) {
                                    map2 = new HashMap();
                                }
                                h3Var.H(u0Var, map2, strM0);
                                break;
                            } else {
                                RRWebIncrementalSnapshotEvent$IncrementalSource rRWebIncrementalSnapshotEvent$IncrementalSource = (RRWebIncrementalSnapshotEvent$IncrementalSource) h3Var.M0(u0Var, new b0(11));
                                io.sentry.config.a.W(rRWebIncrementalSnapshotEvent$IncrementalSource, "");
                                dVar.c = rRWebIncrementalSnapshotEvent$IncrementalSource;
                                break;
                            }
                            break;
                    }
                }
                dVar.k = map2;
                h3Var.t0();
            } else if (strM02.equals("type")) {
                RRWebEventType rRWebEventType = (RRWebEventType) h3Var.M0(u0Var, new b0(10));
                io.sentry.config.a.W(rRWebEventType, "");
                dVar.a = rRWebEventType;
            } else if (strM02.equals("timestamp")) {
                dVar.b = h3Var.nextLong();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                h3Var.H(u0Var, map, strM02);
            }
        }
        dVar.j = map;
        h3Var.t0();
        return dVar;
    }

    public static io.sentry.rrweb.f d(h3 h3Var, u0 u0Var) {
        h3Var.P0();
        io.sentry.rrweb.f fVar = new io.sentry.rrweb.f();
        HashMap map = null;
        while (h3Var.peek() == JsonToken.NAME) {
            String strM0 = h3Var.m0();
            strM0.getClass();
            if (strM0.equals("data")) {
                h3Var.P0();
                HashMap map2 = null;
                while (h3Var.peek() == JsonToken.NAME) {
                    String strM02 = h3Var.m0();
                    strM02.getClass();
                    if (strM02.equals("pointerId")) {
                        fVar.d = h3Var.nextInt();
                    } else if (strM02.equals("positions")) {
                        fVar.e = h3Var.Z0(u0Var, new b0(15));
                    } else if (strM02.equals("source")) {
                        RRWebIncrementalSnapshotEvent$IncrementalSource rRWebIncrementalSnapshotEvent$IncrementalSource = (RRWebIncrementalSnapshotEvent$IncrementalSource) h3Var.M0(u0Var, new b0(11));
                        io.sentry.config.a.W(rRWebIncrementalSnapshotEvent$IncrementalSource, "");
                        fVar.c = rRWebIncrementalSnapshotEvent$IncrementalSource;
                    } else {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        h3Var.H(u0Var, map2, strM02);
                    }
                }
                fVar.g = map2;
                h3Var.t0();
            } else if (strM0.equals("type")) {
                RRWebEventType rRWebEventType = (RRWebEventType) h3Var.M0(u0Var, new b0(10));
                io.sentry.config.a.W(rRWebEventType, "");
                fVar.a = rRWebEventType;
            } else if (strM0.equals("timestamp")) {
                fVar.b = h3Var.nextLong();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                h3Var.H(u0Var, map, strM0);
            }
        }
        fVar.f = map;
        h3Var.t0();
        return fVar;
    }

    public static io.sentry.rrweb.g e(h3 h3Var, u0 u0Var) {
        String strM0;
        h3Var.P0();
        io.sentry.rrweb.g gVar = new io.sentry.rrweb.g();
        HashMap map = null;
        while (h3Var.peek() == JsonToken.NAME) {
            String strM02 = h3Var.m0();
            strM02.getClass();
            if (strM02.equals("data")) {
                h3Var.P0();
                AbstractMap concurrentHashMap = null;
                while (h3Var.peek() == JsonToken.NAME) {
                    strM0 = h3Var.m0();
                    strM0.getClass();
                    switch (strM0) {
                        case "height":
                            Integer numC = h3Var.C();
                            gVar.d = numC != null ? numC.intValue() : 0;
                            break;
                        case "href":
                            String strS = h3Var.S();
                            if (strS == null) {
                                strS = "";
                            }
                            gVar.c = strS;
                            break;
                        case "width":
                            Integer numC2 = h3Var.C();
                            gVar.e = numC2 != null ? numC2.intValue() : 0;
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            h3Var.H(u0Var, concurrentHashMap, strM0);
                            break;
                    }
                }
                h3Var.t0();
            } else if (strM02.equals("type")) {
                RRWebEventType rRWebEventType = (RRWebEventType) h3Var.M0(u0Var, new b0(10));
                io.sentry.config.a.W(rRWebEventType, "");
                gVar.a = rRWebEventType;
            } else if (strM02.equals("timestamp")) {
                gVar.b = h3Var.nextLong();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                h3Var.H(u0Var, map, strM02);
            }
        }
        gVar.f = map;
        h3Var.t0();
        return gVar;
    }

    public static io.sentry.rrweb.i f(h3 h3Var, u0 u0Var) {
        String strM0;
        h3Var.P0();
        io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
        HashMap map = null;
        while (h3Var.peek() == JsonToken.NAME) {
            String strM02 = h3Var.m0();
            strM02.getClass();
            if (strM02.equals("data")) {
                h3Var.P0();
                ConcurrentHashMap concurrentHashMap = null;
                while (h3Var.peek() == JsonToken.NAME) {
                    String strM03 = h3Var.m0();
                    strM03.getClass();
                    if (strM03.equals("payload")) {
                        h3Var.P0();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (h3Var.peek() == JsonToken.NAME) {
                            strM0 = h3Var.m0();
                            strM0.getClass();
                            switch (strM0) {
                                case "description":
                                    iVar.e = h3Var.S();
                                    break;
                                case "endTimestamp":
                                    iVar.g = h3Var.nextDouble();
                                    break;
                                case "startTimestamp":
                                    iVar.f = h3Var.nextDouble();
                                    break;
                                case "op":
                                    iVar.d = h3Var.S();
                                    break;
                                case "data":
                                    ConcurrentHashMap concurrentHashMapQ = io.sentry.config.a.Q((Map) h3Var.O0());
                                    if (concurrentHashMapQ == null) {
                                        break;
                                    } else {
                                        iVar.h = concurrentHashMapQ;
                                        break;
                                    }
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    h3Var.H(u0Var, concurrentHashMap2, strM0);
                                    break;
                            }
                        }
                        iVar.j = concurrentHashMap2;
                        h3Var.t0();
                    } else if (strM03.equals("tag")) {
                        String strS = h3Var.S();
                        if (strS == null) {
                            strS = "";
                        }
                        iVar.c = strS;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        h3Var.H(u0Var, concurrentHashMap, strM03);
                    }
                }
                iVar.k = concurrentHashMap;
                h3Var.t0();
            } else if (strM02.equals("type")) {
                RRWebEventType rRWebEventType = (RRWebEventType) h3Var.M0(u0Var, new b0(10));
                io.sentry.config.a.W(rRWebEventType, "");
                iVar.a = rRWebEventType;
            } else if (strM02.equals("timestamp")) {
                iVar.b = h3Var.nextLong();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                h3Var.H(u0Var, map, strM02);
            }
        }
        iVar.i = map;
        h3Var.t0();
        return iVar;
    }

    public static io.sentry.rrweb.j g(h3 h3Var, u0 u0Var) {
        String strM0;
        h3Var.P0();
        io.sentry.rrweb.j jVar = new io.sentry.rrweb.j();
        HashMap map = null;
        while (h3Var.peek() == JsonToken.NAME) {
            String strM02 = h3Var.m0();
            strM02.getClass();
            int i = 10;
            if (strM02.equals("data")) {
                h3Var.P0();
                ConcurrentHashMap concurrentHashMap = null;
                while (h3Var.peek() == JsonToken.NAME) {
                    String strM03 = h3Var.m0();
                    strM03.getClass();
                    if (strM03.equals("payload")) {
                        h3Var.P0();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (h3Var.peek() == JsonToken.NAME) {
                            strM0 = h3Var.m0();
                            strM0.getClass();
                            switch (strM0) {
                                case "duration":
                                    jVar.f = h3Var.nextLong();
                                    break;
                                case "segmentId":
                                    jVar.d = h3Var.nextInt();
                                    break;
                                case "height":
                                    Integer numC = h3Var.C();
                                    jVar.i = numC != null ? numC.intValue() : 0;
                                    break;
                                case "container":
                                    String strS = h3Var.S();
                                    if (strS == null) {
                                        strS = "";
                                    }
                                    jVar.h = strS;
                                    break;
                                case "frameCount":
                                    Integer numC2 = h3Var.C();
                                    jVar.k = numC2 != null ? numC2.intValue() : 0;
                                    break;
                                case "top":
                                    Integer numC3 = h3Var.C();
                                    jVar.o = numC3 != null ? numC3.intValue() : 0;
                                    break;
                                case "left":
                                    Integer numC4 = h3Var.C();
                                    jVar.n = numC4 != null ? numC4.intValue() : 0;
                                    break;
                                case "size":
                                    Long L = h3Var.L();
                                    jVar.e = L == null ? 0L : L.longValue();
                                    break;
                                case "width":
                                    Integer numC5 = h3Var.C();
                                    jVar.j = numC5 != null ? numC5.intValue() : 0;
                                    break;
                                case "frameRate":
                                    Integer numC6 = h3Var.C();
                                    jVar.m = numC6 != null ? numC6.intValue() : 0;
                                    break;
                                case "encoding":
                                    String strS2 = h3Var.S();
                                    if (strS2 == null) {
                                        strS2 = "";
                                    }
                                    jVar.g = strS2;
                                    break;
                                case "frameRateType":
                                    String strS3 = h3Var.S();
                                    if (strS3 == null) {
                                        strS3 = "";
                                    }
                                    jVar.l = strS3;
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    h3Var.H(u0Var, concurrentHashMap2, strM0);
                                    break;
                            }
                        }
                        jVar.q = concurrentHashMap2;
                        h3Var.t0();
                    } else if (strM03.equals("tag")) {
                        String strS4 = h3Var.S();
                        if (strS4 == null) {
                            strS4 = "";
                        }
                        jVar.c = strS4;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        h3Var.H(u0Var, concurrentHashMap, strM03);
                    }
                }
                jVar.r = concurrentHashMap;
                h3Var.t0();
            } else if (strM02.equals("type")) {
                RRWebEventType rRWebEventType = (RRWebEventType) h3Var.M0(u0Var, new b0(i));
                io.sentry.config.a.W(rRWebEventType, "");
                jVar.a = rRWebEventType;
            } else if (strM02.equals("timestamp")) {
                jVar.b = h3Var.nextLong();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                h3Var.H(u0Var, map, strM02);
            }
        }
        jVar.p = map;
        h3Var.t0();
        return jVar;
    }

    @Override // io.sentry.s1
    public final Object a(h3 h3Var, u0 u0Var) {
        String strM0;
        String strM02;
        String strM03;
        String strM04;
        String strM05;
        String strM06;
        String strM07;
        String strM08;
        int i = 7;
        int i2 = 8;
        int i3 = 4;
        int i4 = 6;
        switch (this.a) {
            case 0:
                c0 c0Var = new c0();
                h3Var.P0();
                ConcurrentHashMap concurrentHashMap = null;
                while (h3Var.peek() == JsonToken.NAME) {
                    strM0 = h3Var.m0();
                    strM0.getClass();
                    switch (strM0) {
                        case "daemon":
                            c0Var.g = h3Var.z0();
                            break;
                        case "priority":
                            c0Var.b = h3Var.C();
                            break;
                        case "held_locks":
                            HashMap mapV = h3Var.V(u0Var, new io.sentry.e(12));
                            if (mapV != null) {
                                c0Var.j = new HashMap(mapV);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "id":
                            c0Var.a = h3Var.L();
                            break;
                        case "main":
                            c0Var.h = h3Var.z0();
                            break;
                        case "name":
                            c0Var.c = h3Var.S();
                            break;
                        case "state":
                            c0Var.d = h3Var.S();
                            break;
                        case "crashed":
                            c0Var.e = h3Var.z0();
                            break;
                        case "current":
                            c0Var.f = h3Var.z0();
                            break;
                        case "stacktrace":
                            c0Var.i = (a0) h3Var.M0(u0Var, new io.sentry.clientreport.a(28));
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            h3Var.H(u0Var, concurrentHashMap, strM0);
                            break;
                    }
                }
                c0Var.k = concurrentHashMap;
                h3Var.t0();
                return c0Var;
            case 1:
                h3Var.P0();
                d0 d0Var = new d0(new ArrayList(), new HashMap(), new f0(TransactionNameSource.CUSTOM.apiName()));
                ConcurrentHashMap concurrentHashMap2 = null;
                while (h3Var.peek() == JsonToken.NAME) {
                    strM02 = h3Var.m0();
                    strM02.getClass();
                    switch (strM02) {
                        case "start_timestamp":
                            try {
                                Double dH0 = h3Var.h0();
                                if (dH0 != null) {
                                    d0Var.q = dH0;
                                }
                                break;
                            } catch (NumberFormatException unused) {
                                if (h3Var.v0(u0Var) != null) {
                                    d0Var.q = Double.valueOf(r8.getTime() / 1000.0d);
                                }
                                break;
                            }
                            break;
                        case "measurements":
                            HashMap mapV2 = h3Var.V(u0Var, new io.sentry.clientreport.a(15));
                            if (mapV2 != null) {
                                d0Var.t.putAll(mapV2);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "type":
                            h3Var.t();
                            break;
                        case "timestamp":
                            try {
                                Double dH02 = h3Var.h0();
                                if (dH02 != null) {
                                    d0Var.r = dH02;
                                }
                                break;
                            } catch (NumberFormatException unused2) {
                                if (h3Var.v0(u0Var) != null) {
                                    d0Var.r = Double.valueOf(r8.getTime() / 1000.0d);
                                }
                                break;
                            }
                            break;
                        case "spans":
                            ArrayList arrayListZ0 = h3Var.Z0(u0Var, new io.sentry.clientreport.a(26));
                            if (arrayListZ0 != null) {
                                d0Var.s.addAll(arrayListZ0);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "transaction_info":
                            h3Var.P0();
                            String strS = null;
                            ConcurrentHashMap concurrentHashMap3 = null;
                            while (h3Var.peek() == JsonToken.NAME) {
                                String strM09 = h3Var.m0();
                                strM09.getClass();
                                if (strM09.equals("source")) {
                                    strS = h3Var.S();
                                } else {
                                    if (concurrentHashMap3 == null) {
                                        concurrentHashMap3 = new ConcurrentHashMap();
                                    }
                                    h3Var.H(u0Var, concurrentHashMap3, strM09);
                                }
                            }
                            f0 f0Var = new f0(strS);
                            f0Var.b = concurrentHashMap3;
                            h3Var.t0();
                            d0Var.u = f0Var;
                            break;
                        case "transaction":
                            d0Var.p = h3Var.S();
                            break;
                        default:
                            if (io.sentry.config.a.q(d0Var, strM02, h3Var, u0Var)) {
                                break;
                            } else {
                                if (concurrentHashMap2 == null) {
                                    concurrentHashMap2 = new ConcurrentHashMap();
                                }
                                h3Var.H(u0Var, concurrentHashMap2, strM02);
                                break;
                            }
                            break;
                    }
                }
                d0Var.v = concurrentHashMap2;
                h3Var.t0();
                return d0Var;
            case 2:
                h3Var.P0();
                g0 g0Var = new g0();
                ConcurrentHashMap concurrentHashMap4 = null;
                while (h3Var.peek() == JsonToken.NAME) {
                    strM03 = h3Var.m0();
                    strM03.getClass();
                    switch (strM03) {
                        case "username":
                            g0Var.c = h3Var.S();
                            break;
                        case "id":
                            g0Var.b = h3Var.S();
                            break;
                        case "geo":
                            h3Var.P0();
                            k kVar = new k();
                            ConcurrentHashMap concurrentHashMap5 = null;
                            while (h3Var.peek() == JsonToken.NAME) {
                                strM04 = h3Var.m0();
                                strM04.getClass();
                                switch (strM04) {
                                    case "region":
                                        kVar.c = h3Var.S();
                                        break;
                                    case "city":
                                        kVar.a = h3Var.S();
                                        break;
                                    case "country_code":
                                        kVar.b = h3Var.S();
                                        break;
                                    default:
                                        if (concurrentHashMap5 == null) {
                                            concurrentHashMap5 = new ConcurrentHashMap();
                                        }
                                        h3Var.H(u0Var, concurrentHashMap5, strM04);
                                        break;
                                }
                            }
                            kVar.d = concurrentHashMap5;
                            h3Var.t0();
                            g0Var.f = kVar;
                            break;
                        case "data":
                            g0Var.g = io.sentry.config.a.Q((Map) h3Var.O0());
                            break;
                        case "name":
                            g0Var.e = h3Var.S();
                            break;
                        case "email":
                            g0Var.a = h3Var.S();
                            break;
                        case "ip_address":
                            g0Var.d = h3Var.S();
                            break;
                        default:
                            if (concurrentHashMap4 == null) {
                                concurrentHashMap4 = new ConcurrentHashMap();
                            }
                            h3Var.H(u0Var, concurrentHashMap4, strM03);
                            break;
                    }
                }
                g0Var.h = concurrentHashMap4;
                h3Var.t0();
                return g0Var;
            case 3:
                h3Var.P0();
                String strS2 = null;
                ArrayList arrayListZ02 = null;
                HashMap map = null;
                while (h3Var.peek() == JsonToken.NAME) {
                    String strM010 = h3Var.m0();
                    strM010.getClass();
                    if (strM010.equals("rendering_system")) {
                        strS2 = h3Var.S();
                    } else if (strM010.equals("windows")) {
                        arrayListZ02 = h3Var.Z0(u0Var, new b0(i3));
                    } else {
                        if (map == null) {
                            map = new HashMap();
                        }
                        h3Var.H(u0Var, map, strM010);
                    }
                }
                h3Var.t0();
                h0 h0Var = new h0(strS2, arrayListZ02);
                h0Var.c = map;
                return h0Var;
            case 4:
                i0 i0Var = new i0();
                h3Var.P0();
                HashMap map2 = null;
                while (h3Var.peek() == JsonToken.NAME) {
                    strM05 = h3Var.m0();
                    strM05.getClass();
                    switch (strM05) {
                        case "rendering_system":
                            i0Var.a = h3Var.S();
                            break;
                        case "identifier":
                            i0Var.c = h3Var.S();
                            break;
                        case "height":
                            i0Var.f = h3Var.h0();
                            break;
                        case "x":
                            i0Var.g = h3Var.h0();
                            break;
                        case "y":
                            i0Var.h = h3Var.h0();
                            break;
                        case "tag":
                            i0Var.d = h3Var.S();
                            break;
                        case "type":
                            i0Var.b = h3Var.S();
                            break;
                        case "alpha":
                            i0Var.j = h3Var.h0();
                            break;
                        case "width":
                            i0Var.e = h3Var.h0();
                            break;
                        case "children":
                            i0Var.k = h3Var.Z0(u0Var, this);
                            break;
                        case "visibility":
                            i0Var.i = h3Var.S();
                            break;
                        default:
                            if (map2 == null) {
                                map2 = new HashMap();
                            }
                            h3Var.H(u0Var, map2, strM05);
                            break;
                    }
                }
                h3Var.t0();
                i0Var.l = map2;
                return i0Var;
            case 5:
                h3Var.P0();
                io.sentry.protocol.profiling.a aVar = new io.sentry.protocol.profiling.a();
                ConcurrentHashMap concurrentHashMap6 = null;
                while (h3Var.peek() == JsonToken.NAME) {
                    strM06 = h3Var.m0();
                    strM06.getClass();
                    switch (strM06) {
                        case "frames":
                            ArrayList arrayListZ03 = h3Var.Z0(u0Var, new io.sentry.clientreport.a(27));
                            if (arrayListZ03 != null) {
                                aVar.c = arrayListZ03;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "stacks":
                            List list = (List) h3Var.M0(u0Var, new b0(i4));
                            if (list != null) {
                                aVar.b = list;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "samples":
                            ArrayList arrayListZ04 = h3Var.Z0(u0Var, new b0(i));
                            if (arrayListZ04 != null) {
                                aVar.a = arrayListZ04;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "thread_metadata":
                            HashMap mapV3 = h3Var.V(u0Var, new b0(i2));
                            if (mapV3 != null) {
                                aVar.d = mapV3;
                                break;
                            } else {
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap6 == null) {
                                concurrentHashMap6 = new ConcurrentHashMap();
                            }
                            h3Var.H(u0Var, concurrentHashMap6, strM06);
                            break;
                    }
                }
                aVar.e = concurrentHashMap6;
                h3Var.t0();
                return aVar;
            case 6:
                ArrayList arrayList = new ArrayList();
                h3Var.c1();
                while (h3Var.hasNext()) {
                    ArrayList arrayList2 = new ArrayList();
                    h3Var.c1();
                    while (h3Var.hasNext()) {
                        arrayList2.add(Integer.valueOf(h3Var.nextInt()));
                    }
                    h3Var.W0();
                    arrayList.add(arrayList2);
                }
                h3Var.W0();
                return arrayList;
            case 7:
                h3Var.P0();
                io.sentry.protocol.profiling.b bVar = new io.sentry.protocol.profiling.b();
                HashMap map3 = null;
                while (h3Var.peek() == JsonToken.NAME) {
                    strM07 = h3Var.m0();
                    strM07.getClass();
                    switch (strM07) {
                        case "thread_id":
                            bVar.c = h3Var.S();
                            break;
                        case "timestamp":
                            bVar.a = h3Var.nextDouble();
                            break;
                        case "stack_id":
                            bVar.b = h3Var.nextInt();
                            break;
                        default:
                            if (map3 == null) {
                                map3 = new HashMap();
                            }
                            h3Var.H(u0Var, map3, strM07);
                            break;
                    }
                }
                bVar.d = map3;
                h3Var.t0();
                return bVar;
            case 8:
                h3Var.P0();
                io.sentry.protocol.profiling.c cVar = new io.sentry.protocol.profiling.c();
                HashMap map4 = null;
                while (h3Var.peek() == JsonToken.NAME) {
                    String strM011 = h3Var.m0();
                    strM011.getClass();
                    if (strM011.equals("priority")) {
                        cVar.b = h3Var.nextInt();
                    } else if (strM011.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                        cVar.a = h3Var.S();
                    } else {
                        if (map4 == null) {
                            map4 = new HashMap();
                        }
                        h3Var.H(u0Var, map4, strM011);
                    }
                }
                cVar.c = map4;
                h3Var.t0();
                return cVar;
            case 9:
                return b(h3Var, u0Var);
            case 10:
                return RRWebEventType.values()[h3Var.nextInt()];
            case 11:
                return RRWebIncrementalSnapshotEvent$IncrementalSource.values()[h3Var.nextInt()];
            case 12:
                return c(h3Var, u0Var);
            case 13:
                return RRWebInteractionEvent$InteractionType.values()[h3Var.nextInt()];
            case 14:
                return d(h3Var, u0Var);
            case 15:
                h3Var.P0();
                io.sentry.rrweb.e eVar = new io.sentry.rrweb.e();
                HashMap map5 = null;
                while (h3Var.peek() == JsonToken.NAME) {
                    strM08 = h3Var.m0();
                    strM08.getClass();
                    switch (strM08) {
                        case "x":
                            eVar.b = h3Var.nextFloat();
                            break;
                        case "y":
                            eVar.c = h3Var.nextFloat();
                            break;
                        case "id":
                            eVar.a = h3Var.nextInt();
                            break;
                        case "timeOffset":
                            eVar.d = h3Var.nextLong();
                            break;
                        default:
                            if (map5 == null) {
                                map5 = new HashMap();
                            }
                            h3Var.H(u0Var, map5, strM08);
                            break;
                    }
                }
                eVar.e = map5;
                h3Var.t0();
                return eVar;
            case 16:
                return e(h3Var, u0Var);
            case 17:
                return f(h3Var, u0Var);
            default:
                return g(h3Var, u0Var);
        }
    }
}
