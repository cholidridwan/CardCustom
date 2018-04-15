package com.musaceae.tcustomcard;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.support.annotation.StyleableRes;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * TODO: document your custom view class.
 */
public class MyCard extends LinearLayout {

    @StyleableRes
    int index0 = 0;
    @StyleableRes
    int index1 = 1;
    @StyleableRes
    int index2 = 2;

    TextView cardText;
    ImageView cardImage;
    Button cardButton;

    public MyCard(Context context, AttributeSet attributeSet){
        super(context, attributeSet);
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet){
        inflate(context, R.layout.my_card, this);

        int[] sets = {R.attr.cardText, R.attr.cardImage, R.attr.cardButton};
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, sets);
        CharSequence txt = typedArray.getText(index0);
        CharSequence img = typedArray.getText(index1);
        CharSequence btn = typedArray.getText(index2);
        typedArray.recycle();

        initComponents();
        setCardText(txt);
        setCardImage(img);
        setCardButton(btn);

    }

    private void initComponents(){
        cardText = (TextView)findViewById(R.id.card_text);
        cardImage = (ImageView)findViewById(R.id.card_image);
        cardButton = (Button)findViewById(R.id.card_button);

    }

    public CharSequence getCardText() {
        return cardText.getText();
    }

    public void setCardText(CharSequence value) {
        cardText.setText(value);
    }

    public CharSequence getCardImage() {
        return cardImage.getTooltipText();
    }

    public void setCardImage(CharSequence value) {
        //cardImage.setImageURI((Uri) value);
        //cardImage.setImageResource(value);
    }

    public CharSequence getCardButton() {
        return cardButton.getText();
    }

    public void setCardButton(CharSequence value) {
        cardButton.setText(value);
    }
}
