package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import io.sentry.android.core.t0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sw implements ax4 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ sw(Object obj, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // defpackage.ax4
    public final zw4 a(Object obj, int i, int i2, sv5 sv5Var) {
        gb2 gb2Var;
        zw4 zw4VarA;
        Uri uri;
        switch (this.a) {
            case 0:
                Uri uri2 = (Uri) obj;
                String strSubstring = uri2.toString().substring(22);
                yq5 yq5Var = new yq5(uri2);
                AssetManager assetManager = (AssetManager) this.c;
                switch (((rw) this.b).a) {
                    case 0:
                        gb2Var = new gb2(assetManager, strSubstring, 0);
                        break;
                    default:
                        gb2Var = new gb2(assetManager, strSubstring, 1);
                        break;
                }
                return new zw4(yq5Var, gb2Var);
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) sv5Var.c(l67.b);
                return new zw4(new yq5(num), new qo1(theme, theme != null ? theme.getResources() : ((Context) this.c).getResources(), (po1) this.b, num.intValue()));
            case 2:
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                sx3 sx3Var = null;
                for (int i3 = 0; i3 < size; i3++) {
                    ax4 ax4Var = (ax4) arrayList.get(i3);
                    if (ax4Var.b(obj) && (zw4VarA = ax4Var.a(obj, i, i2, sv5Var)) != null) {
                        sx3Var = zw4VarA.a;
                        arrayList2.add(zw4VarA.c);
                    }
                }
                if (arrayList2.isEmpty() || sx3Var == null) {
                    return null;
                }
                return new zw4(sx3Var, new o95(arrayList2, (bi6) this.b));
            case 3:
                Integer num2 = (Integer) obj;
                try {
                    uri = Uri.parse("android.resource://" + ((Resources) this.b).getResourcePackageName(num2.intValue()) + '/' + num2);
                    break;
                } catch (Resources.NotFoundException e) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        t0.n("ResourceLoader", "Received invalid resource id: " + num2, e);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((ax4) this.c).a(uri, i, i2, sv5Var);
            default:
                Uri uri3 = (Uri) obj;
                ax4 ax4Var2 = (ax4) this.b;
                List<String> pathSegments = uri3.getPathSegments();
                zw4 zw4VarA2 = null;
                if (pathSegments.size() == 1) {
                    try {
                        int i4 = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (i4 != 0) {
                            zw4VarA2 = ax4Var2.a(Integer.valueOf(i4), i, i2, sv5Var);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            t0.m("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return zw4VarA2;
                    } catch (NumberFormatException e2) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return zw4VarA2;
                        }
                        t0.n("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e2);
                        return zw4VarA2;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    t0.m("ResourceUriLoader", "Failed to parse resource uri: " + uri3);
                    return null;
                }
                List<String> pathSegments2 = uri3.getPathSegments();
                String str = pathSegments2.get(0);
                String str2 = pathSegments2.get(1);
                Context context = (Context) this.c;
                int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
                if (identifier != 0) {
                    return ax4Var2.a(Integer.valueOf(identifier), i, i2, sv5Var);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                t0.m("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    @Override // defpackage.ax4
    public final boolean b(Object obj) {
        switch (this.a) {
            case 0:
                Uri uri = (Uri) obj;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            case 1:
                return true;
            case 2:
                Iterator it = ((ArrayList) this.c).iterator();
                while (it.hasNext()) {
                    if (((ax4) it.next()).b(obj)) {
                        return true;
                    }
                }
                return false;
            case 3:
                return true;
            default:
                Uri uri2 = (Uri) obj;
                return "android.resource".equals(uri2.getScheme()) && ((Context) this.c).getPackageName().equals(uri2.getAuthority());
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.c).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public sw(Resources resources, ax4 ax4Var) {
        this.a = 3;
        this.b = resources;
        this.c = ax4Var;
    }

    public sw(Context context, po1 po1Var) {
        this.a = 1;
        this.c = context.getApplicationContext();
        this.b = po1Var;
    }

    public sw(Context context, ax4 ax4Var) {
        this.a = 4;
        this.c = context.getApplicationContext();
        this.b = ax4Var;
    }
}
