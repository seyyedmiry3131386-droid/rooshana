package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class CastDto implements Serializable {

    @vo7("people")
    private final List<PersonDto> people;

    @vo7("title")
    private final String title;

    public CastDto(String str, List<PersonDto> list) {
        js3.p(str, "title");
        js3.p(list, "people");
        this.title = str;
        this.people = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!CastDto.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.data.webapi.CastDto");
        return js3.i(this.title, ((CastDto) obj).title);
    }

    public final List<PersonDto> getPeople() {
        return this.people;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode();
    }
}
