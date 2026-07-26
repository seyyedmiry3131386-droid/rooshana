package defpackage;

import ir.mservices.market.app.home.data.HugeBannerDto;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class qi4 extends y40 {
    public final cv s;
    public final xs8 t;
    public final ArrayList u = new ArrayList(0);
    public kd3 v = new kd3("", 0, Collections.EMPTY_MAP, null);
    public boolean w;
    public boolean x;
    public static final Set y = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("a", "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", "i", "img", "input", "kbd", "label", "map", "object", "q", "samp", "script", "select", HugeBannerDto.DISPLAY_SIZE_SMALL, "span", "strong", "sub", "sup", "textarea", "time", "tt", "var")));
    public static final Set z = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", CommonDataKt.AD_LINK, "meta", "param", "source", "track", "wbr")));
    public static final Set A = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", "form", "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", "p", "pre", "section", "table", "tfoot", "ul", "video")));

    public qi4(cv cvVar, xs8 xs8Var) {
        this.s = cvVar;
        this.t = xs8Var;
    }

    public static Map M(in8 in8Var) {
        dy dyVar = in8Var.k;
        int i = dyVar.a;
        if (i <= 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(i);
        int i2 = 0;
        while (true) {
            if (!(i2 < dyVar.a)) {
                return DesugarCollections.unmodifiableMap(map);
            }
            String str = dyVar.c[i2];
            String str2 = dyVar.b[i2];
            if (str == null) {
                str = "";
            }
            ay ayVar = new ay();
            if (str2 == null) {
                throw new IllegalArgumentException("Object must not be null");
            }
            ayVar.a = str2.trim();
            if (str2.length() == 0) {
                throw new IllegalArgumentException("String must not be empty");
            }
            ayVar.b = str;
            ayVar.c = dyVar;
            i2++;
            map.put(ayVar.a.toLowerCase(Locale.US), ayVar.b);
        }
    }
}
