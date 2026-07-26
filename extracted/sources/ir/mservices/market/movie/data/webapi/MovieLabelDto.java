package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.rm7;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieLabelDto implements Serializable {

    @vo7("bgColor")
    private final String bgColor;

    @vo7(ConfirmDTO.INPUT_TYPE_TEXT)
    private final String text;

    @vo7("textColor")
    private final String textColor;

    public MovieLabelDto(String str, String str2, String str3) {
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(str2, "textColor");
        js3.p(str3, "bgColor");
        this.text = str;
        this.textColor = str2;
        this.bgColor = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MovieLabelDto.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.data.webapi.MovieLabelDto");
        MovieLabelDto movieLabelDto = (MovieLabelDto) obj;
        return js3.i(this.text, movieLabelDto.text) && js3.i(this.textColor, movieLabelDto.textColor) && js3.i(this.bgColor, movieLabelDto.bgColor);
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return this.bgColor.hashCode() + rm7.k(this.textColor, this.text.hashCode() * 31, 31);
    }
}
