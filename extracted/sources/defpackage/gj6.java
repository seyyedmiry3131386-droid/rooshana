package defpackage;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite$MethodToInvoke;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.c;
import androidx.datastore.preferences.protobuf.d;
import androidx.datastore.preferences.protobuf.f;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gj6 extends f {
    private static final gj6 DEFAULT_INSTANCE;
    private static volatile k26 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private MapFieldLite<String, kj6> preferences_ = MapFieldLite.b;

    static {
        gj6 gj6Var = new gj6();
        DEFAULT_INSTANCE = gj6Var;
        f.j(gj6.class, gj6Var);
    }

    public static MapFieldLite l(gj6 gj6Var) {
        MapFieldLite<String, kj6> mapFieldLite = gj6Var.preferences_;
        if (!mapFieldLite.a) {
            gj6Var.preferences_ = mapFieldLite.c();
        }
        return gj6Var.preferences_;
    }

    public static ej6 n() {
        return (ej6) ((er2) DEFAULT_INSTANCE.c(GeneratedMessageLite$MethodToInvoke.e));
    }

    public static gj6 o(InputStream inputStream) {
        mu0 cVar;
        gj6 gj6Var = DEFAULT_INSTANCE;
        if (inputStream == null) {
            byte[] bArr = ur3.b;
            cVar = mu0.f(bArr, 0, bArr.length, false);
        } else {
            cVar = new c(inputStream);
        }
        i72 i72VarA = i72.a();
        f fVarI = gj6Var.i();
        try {
            hn6 hn6Var = hn6.c;
            hn6Var.getClass();
            hf7 hf7VarA = hn6Var.a(fVarI.getClass());
            d dVar = (d) cVar.b;
            if (dVar == null) {
                dVar = new d(cVar);
            }
            hf7VarA.f(fVarI, dVar, i72VarA);
            hf7VarA.b(fVarI);
            if (f.f(fVarI, true)) {
                return (gj6) fVarI;
            }
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        } catch (InvalidProtocolBufferException e) {
            if (e.a) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f
    public final Object c(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        k26 gr2Var;
        switch (generatedMessageLite$MethodToInvoke.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new iv6(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", fj6.a});
            case 3:
                return new gj6();
            case 4:
                return new ej6(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                k26 k26Var = PARSER;
                if (k26Var != null) {
                    return k26Var;
                }
                synchronized (gj6.class) {
                    try {
                        gr2Var = PARSER;
                        if (gr2Var == null) {
                            gr2Var = new gr2();
                            PARSER = gr2Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return gr2Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map m() {
        return DesugarCollections.unmodifiableMap(this.preferences_);
    }
}
