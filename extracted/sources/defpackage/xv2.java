package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.android.volley.AuthFailureError;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.Request$Priority;
import com.android.volley.VolleyError;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import ir.mservices.market.version2.webapi.responsedto.ErrorActionDto;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public class xv2 extends x47 {
    public static final String y;
    public static final vv2 z;
    public final boolean o;
    public Map p;
    public zv2 q;
    public wv2 r;
    public final z57 s;
    public final Request$Priority t;
    public boolean u;
    public final RequestDTO v;
    public Type w;
    public byte[] x;

    static {
        Locale locale = Locale.US;
        y = "application/json; charset=utf-8";
        z = new vv2();
    }

    public xv2(int i, z57 z57Var, RequestDTO requestDTO, Request$Priority request$Priority, boolean z2, Object obj, wv2 wv2Var, zv2 zv2Var, boolean z3) {
        super(i, z57Var.g);
        this.p = Collections.EMPTY_MAP;
        this.u = true;
        this.s = z57Var;
        this.v = requestDTO;
        this.t = request$Priority;
        this.h = z2;
        wv2 wv2Var2 = this.r;
        if (wv2Var2 != null) {
            wv2Var2.a = null;
        }
        this.r = wv2Var;
        wv2Var.a = this;
        zv2 zv2Var2 = this.q;
        if (zv2Var2 != null) {
            zv2Var2.a = null;
        }
        this.q = zv2Var;
        zv2Var.a = this;
        this.m = obj;
        this.o = z3;
        this.k = ff5.b();
        if (z2) {
            if (i == 1 || i == 3 || i == 2) {
                lw.g(null, "Are you sure to cache this response with this url", z57Var);
            }
        }
    }

    @Override // defpackage.x47
    public final void b() {
        this.q = null;
        this.r = null;
        this.m = null;
        super.b();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.x47
    public final void c(VolleyError volleyError) {
        String str;
        ErrorDTO errorDTO;
        ErrorDTO errorDTO2;
        ErrorDTO errorDTO3;
        Map map;
        byte[] bArr;
        String str2;
        wv2 wv2Var = this.r;
        if (wv2Var != null) {
            l2 l2Var = (l2) wv2Var;
            h32 h32Var = l2Var.c;
            o2 o2Var = l2Var.d;
            if (volleyError instanceof NoConnectionError) {
                errorDTO2 = new ErrorDTO(2, "NoConnectionError " + volleyError.getMessage(), o2Var.context.getString(rs6.no_connection));
            } else if ((volleyError instanceof ParseError) && (volleyError.getCause() instanceof JsonSyntaxException)) {
                errorDTO2 = new ErrorDTO(-2, -2, "Error data is not readable, " + rk1.c(volleyError), o2Var.context.getResources().getString(rs6.error_dto_default_message));
                fn5 fn5Var = volleyError.a;
                if (fn5Var != null) {
                    errorDTO2.setHttpStatus(fn5Var.a);
                }
            } else {
                fn5 fn5Var2 = volleyError.a;
                str = "";
                if (fn5Var2 == null || (bArr = (byte[]) fn5Var2.c) == null || bArr.length <= 0) {
                    if (fn5Var2 != null) {
                        int i = fn5Var2.a;
                        if (i < 300 || i > 399 || (map = (Map) fn5Var2.d) == null) {
                            errorDTO3 = null;
                        } else {
                            String str3 = (String) map.get("location");
                            if (str3 == null || f88.n0(str3)) {
                                String str4 = o2.V1;
                            } else {
                                str = str3;
                            }
                            Uri uri = Uri.parse(str);
                            if ("http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme())) {
                                errorDTO3 = new ErrorDTO(-1, i, "Redirect error, " + rk1.c(volleyError), o2Var.context.getResources().getString(rs6.error_dto_default_message));
                            } else {
                                errorDTO3 = new ErrorDTO(-3, i, "Redirect location not valid error, " + rk1.c(volleyError), o2Var.context.getResources().getString(rs6.error_dto_default_message));
                            }
                        }
                        if (errorDTO3 == null) {
                            errorDTO = new ErrorDTO(-1, fn5Var2.a, "Unknown error, " + rk1.c(volleyError), o2Var.context.getResources().getString(rs6.error_dto_default_message));
                        } else {
                            errorDTO2 = errorDTO3;
                        }
                    } else {
                        errorDTO = new ErrorDTO(-1, "Unknown error, " + rk1.c(volleyError), o2Var.context.getResources().getString(rs6.error_dto_default_message));
                    }
                    errorDTO2 = errorDTO;
                } else {
                    try {
                        str2 = new String(bArr);
                        try {
                            ErrorDTO errorDTO4 = (ErrorDTO) o2.gson.c(str2, ErrorDTO.class);
                            if (errorDTO4 == null) {
                                throw new JSONException("ErrorDTO did not created with the given data");
                            }
                            errorDTO4.setHttpStatus(fn5Var2.a);
                            errorDTO2 = errorDTO4;
                        } catch (JsonSyntaxException unused) {
                            if (str2 != null) {
                                ", response data = ".concat(str2);
                            }
                            int i2 = fn5Var2.a;
                            StringBuilder sb = new StringBuilder("Error data is not readable");
                            sb.append(str2 != null ? ", response data = ".concat(str2) : "");
                            sb.append(", ");
                            sb.append(rk1.c(volleyError));
                            errorDTO2 = new ErrorDTO(-2, i2, sb.toString(), o2Var.context.getResources().getString(rs6.error_dto_default_message));
                        } catch (Exception unused2) {
                            if (str2 != null) {
                                ", response data = ".concat(str2);
                            }
                            int i3 = fn5Var2.a;
                            StringBuilder sb2 = new StringBuilder("Error data is not readable");
                            sb2.append(str2 != null ? ", response data = ".concat(str2) : "");
                            sb2.append(", ");
                            sb2.append(rk1.c(volleyError));
                            errorDTO2 = new ErrorDTO(-1, i3, sb2.toString(), o2Var.context.getResources().getString(rs6.error_dto_default_message));
                        }
                    } catch (JsonSyntaxException unused3) {
                        str2 = null;
                    } catch (Exception unused4) {
                        str2 = null;
                    }
                }
            }
            lw.d(null, null, errorDTO2);
            String str5 = l2Var.a.c;
            if (!TextUtils.isEmpty(str5)) {
                String host = Uri.parse(str5).getHost();
                if (!TextUtils.isEmpty(host)) {
                    errorDTO2.setHost(host);
                }
            }
            if (errorDTO2.getErrorAction() != null) {
                t32 t32VarB = t32.b();
                ErrorActionDto errorAction = errorDTO2.getErrorAction();
                m2 m2Var = new m2();
                m2Var.a = errorAction;
                t32VarB.g(m2Var);
            }
            if (volleyError instanceof AuthFailureError) {
                if (errorDTO2.getCode() == 426 && !TextUtils.isEmpty(errorDTO2.getExtra())) {
                    sb7.p("MyketAbstractService", "Authorization Failure Error", "(Force Update), Url: " + l2Var.a.c);
                    try {
                        int i4 = Integer.parseInt(errorDTO2.getExtra());
                        t32 t32VarB2 = t32.b();
                        n2 n2Var = new n2();
                        n2Var.a = i4;
                        t32VarB2.g(n2Var);
                        return;
                    } catch (NumberFormatException unused5) {
                        lw.g(null, "Extra field in this scenario must be Integer. Extra: " + errorDTO2.getExtra(), null);
                    }
                } else if (l2Var.b) {
                    errorDTO2.toString();
                    sb7.p("MyketAbstractService", "Authorization Failure Error", "(Server Expires), Url: " + l2Var.a.c);
                    o2Var.authorizationManager.b(null);
                    xv2 xv2Var = l2Var.a;
                    if (xv2Var.u) {
                        o2Var.performRequest(xv2Var, h32Var);
                        return;
                    }
                }
            }
            o2Var.serverMonitor.c(l2Var.a.s, volleyError);
            if (h32Var != null) {
                h32Var.j(errorDTO2);
            }
        }
    }

    @Override // defpackage.x47
    public final void d(Object obj) {
        zv2 zv2Var = this.q;
        if (zv2Var != null) {
            k2 k2Var = (k2) zv2Var;
            o2 o2Var = k2Var.e;
            if (obj == null && !k2Var.b) {
                lw.g(null, "Response is null", "request=" + k2Var.a);
                o2Var.serverMonitor.c(k2Var.a.s, new ParseError());
                h32 h32Var = k2Var.c;
                if (h32Var != null) {
                    h32Var.j(new ErrorDTO(-1, "Response is null", o2Var.context.getString(rs6.error_dto_default_message)));
                    return;
                }
                return;
            }
            bp7 bp7Var = o2Var.serverMonitor;
            xv2 xv2Var = k2Var.a;
            z57 z57Var = xv2Var.s;
            int i = xv2Var.k.b;
            bp7Var.getClass();
            xo7 xo7Var = z57Var.h ? (xo7) bp7Var.c.get(z57Var.a) : null;
            if (xo7Var != null) {
                if (i > 0) {
                    xo7Var.a(4);
                } else {
                    String str = lw.a;
                    int i2 = xo7Var.b;
                    if (i2 > 0) {
                        int i3 = i2 - 1;
                        xo7Var.b = i3;
                        if (i3 < 0) {
                            xo7Var.b = 0;
                        }
                        for (dp7 dp7Var : xo7Var.c) {
                            int i4 = dp7Var.e;
                            if (i4 > 0) {
                                int i5 = i4 - 1;
                                dp7Var.e = i5;
                                if (i5 < 0) {
                                    dp7Var.e = 0;
                                }
                            }
                        }
                    }
                }
            }
            gb8 gb8Var = k2Var.d;
            if (gb8Var != null) {
                gb8Var.onSuccess(obj);
            }
        }
    }

    @Override // defpackage.x47
    public byte[] f() {
        byte[] bArr = this.x;
        if (bArr != null) {
            return bArr;
        }
        RequestDTO requestDTO = this.v;
        if (requestDTO == null) {
            this.x = null;
        } else {
            String strF = z.f(requestDTO);
            if (this.o) {
                try {
                    this.x = dy3.A(strF);
                } catch (IOException e) {
                    lw.g(e, "IOException while trying to gzip", "json=" + strF);
                    this.x = null;
                }
            } else {
                try {
                    this.x = strF.getBytes("utf-8");
                } catch (UnsupportedEncodingException e2) {
                    lw.g(e2, "Unsupported Encoding while trying to get request body", "json=" + strF + ", charset=utf-8");
                    this.x = null;
                }
            }
        }
        return this.x;
    }

    @Override // defpackage.x47
    public String g() {
        return y;
    }

    @Override // defpackage.x47
    public final String h() {
        z57 z57Var = this.s;
        String str = z57Var.g;
        if (z57Var.i == null) {
            if (z57Var.h) {
                z57Var.i = str.substring(z57Var.a.length() + 1);
            } else {
                z57Var.i = str;
            }
        }
        return z57Var.i;
    }

    @Override // defpackage.x47
    public final Map i() {
        int i;
        byte[] bArrF = f();
        if ((bArrF == null || bArrF.length == 0) && ((i = this.b) == 2 || i == 1 || i == 3)) {
            if (this.p.size() == 0) {
                this.p = new HashMap();
            }
            String str = (String) this.p.put("content-length", "0");
            if (str != null) {
                lw.a("Request body is empty but Content-Length header is set", "0", str);
                this.p.put("content-length", str);
            }
        }
        if (this.o) {
            if (this.p.size() == 0) {
                this.p = new HashMap();
            }
            String str2 = (String) this.p.put("content-encoding", "gzip");
            if (str2 != null) {
                lw.a("Content encoding header already set", "gzip", str2);
                this.p.put("content-encoding", str2);
            }
        }
        if (!fg5.c(Uri.parse(this.c))) {
            this.p.remove("Myket-Version");
            this.p.remove("Authorization");
        }
        return this.p;
    }

    @Override // defpackage.x47
    public final Request$Priority j() {
        return this.t;
    }

    @Override // defpackage.x47
    public ry p(fn5 fn5Var) {
        try {
            String str = new String((byte[]) fn5Var.c, "utf-8");
            vv2 vv2Var = z;
            Type type = this.w;
            vv2Var.getClass();
            return new ry(vv2Var.b(str, TypeToken.get(type)), yh0.E(fn5Var));
        } catch (JsonSyntaxException e) {
            return new ry(new ParseError(e));
        } catch (UnsupportedEncodingException e2) {
            return new ry(new ParseError(e2));
        }
    }
}
