package io.techery.sample.base.cell;

import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import io.techery.celladapter.Cell;
import io.techery.celladapter.Layout;
import io.techery.sample.BaseCell;
import io.techery.sample.R;
import io.techery.sample.base.model.GammaModel;

@Layout(R.layout.item_base_gamma)
public class GammaCell extends BaseCell<GammaModel, GammaCell.Listener> {

	@BindView(R.id.tv_gamma)
	TextView textView;

	public GammaCell(View view) {
		super(view);
	}

	@Override
	protected void syncUiWithItem() {
		textView.setText(getItem().getGamma());
	}

	@Override
	public void prepareForReuse() {

	}

	public interface Listener extends Cell.Listener<GammaModel> {

	}
}