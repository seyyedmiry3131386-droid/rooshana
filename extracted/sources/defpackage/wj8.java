package defpackage;

import android.content.Context;
import ir.mservices.market.setting.themeStyle.recycler.ThemeStyleItemData;
import ir.mservices.market.theme.ThemeStyle;
import ir.mservices.market.versionNote.ui.recycler.VersionNoteHeaderData;
import ir.mservices.market.versionNote.ui.recycler.VersionNoteLastVersionData;
import ir.mservices.market.versionNote.ui.recycler.VersionRowData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wj8 extends c16 {
    public final /* synthetic */ int c = 1;
    public final Context d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj8(Context context, lu7 lu7Var) {
        super(0);
        js3.p(lu7Var, "sharedPreferencesProxy");
        this.d = context;
        this.e = lu7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v21 */
    @Override // defpackage.c16
    public final List e() {
        int i;
        String[] strArr;
        int i2;
        ?? r8;
        switch (this.c) {
            case 0:
                List list = ThemeStyle.p;
                ArrayList arrayList = new ArrayList();
                z0 z0Var = (z0) list;
                z0Var.getClass();
                w0 w0Var = new w0(0, z0Var);
                while (w0Var.hasNext()) {
                    Object next = w0Var.next();
                    if (((Boolean) ((ThemeStyle) next).f.invoke()).booleanValue()) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
                int i3 = 0;
                for (Object obj : arrayList) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        br9.P();
                        throw null;
                    }
                    ThemeStyle themeStyle = (ThemeStyle) obj;
                    v48 v48Var = (v48) this.e;
                    int size = arrayList.size();
                    int integer = this.d.getResources().getInteger(ds6.theme_style_max_span);
                    int i5 = size % 3 != 2 ? 3 : 2;
                    int i6 = size - i5;
                    arrayList2.add(new ThemeStyleItemData(themeStyle, v48Var, i3 >= i6 ? integer / i5 : integer / (i6 / 2)));
                    i3 = i4;
                }
                return arrayList2;
            default:
                int iC = ((lu7) this.e).c(-1, lu7.J);
                ArrayList arrayList3 = new ArrayList();
                String[] stringArray = this.d.getResources().getStringArray(mp6.version_note_arr);
                js3.o(stringArray, "getStringArray(...)");
                ArrayList arrayList4 = new ArrayList();
                boolean z = false;
                String str = stringArray[0];
                js3.o(str, "get(...)");
                int i7 = 1;
                String strSubstring = str.substring(1);
                js3.o(strSubstring, "substring(...)");
                String str2 = stringArray[0];
                js3.o(str2, "get(...)");
                try {
                    i = Integer.parseInt(m88.X(m88.X(str2, ".", ""), "-", ""));
                    break;
                } catch (Exception unused) {
                    i = 0;
                }
                int length = stringArray.length;
                int i8 = 1;
                boolean z2 = true;
                ?? r10 = i;
                while (i8 < length) {
                    int i9 = i7;
                    if (z2) {
                        String str3 = stringArray[i8];
                        js3.o(str3, "get(...)");
                        if (m88.Z(str3, "-", z)) {
                            arrayList3.add(new VersionNoteLastVersionData(strSubstring, arrayList4));
                            z2 = z;
                        } else {
                            String str4 = stringArray[i8];
                            js3.o(str4, "get(...)");
                            arrayList4.add(str4);
                        }
                        if (i8 == stringArray.length - 1) {
                            arrayList3.add(new VersionNoteLastVersionData(strSubstring, arrayList4));
                        }
                    }
                    if (z2) {
                        strArr = stringArray;
                        i2 = i9;
                    } else {
                        String str5 = stringArray[i8];
                        js3.o(str5, "get(...)");
                        if (m88.Z(str5, "-", z)) {
                            String str6 = stringArray[i8];
                            js3.o(str6, "get(...)");
                            try {
                                r8 = Integer.parseInt(m88.X(m88.X(str6, ".", ""), "-", ""));
                            } catch (Exception unused2) {
                                r8 = z;
                            }
                            if (r8 > iC) {
                                String str7 = stringArray[i8];
                                js3.o(str7, "get(...)");
                                strArr = stringArray;
                                i2 = i9;
                                String strSubstring2 = str7.substring(i2);
                                js3.o(strSubstring2, "substring(...)");
                                arrayList3.add(new VersionNoteHeaderData(strSubstring2));
                            } else {
                                strArr = stringArray;
                                i2 = i9;
                            }
                            r10 = r8;
                            break;
                        } else {
                            strArr = stringArray;
                            i2 = i9;
                            if (r10 > iC) {
                                String str8 = strArr[i8];
                                js3.o(str8, "get(...)");
                                arrayList3.add(new VersionRowData(str8));
                            }
                        }
                    }
                    i8++;
                    i7 = i2;
                    stringArray = strArr;
                    z = false;
                    r10 = r10;
                }
                return arrayList3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj8(Context context, v48 v48Var) {
        super(0);
        js3.p(v48Var, "selectedTheme");
        this.d = context;
        this.e = v48Var;
    }
}
