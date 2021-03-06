package de.codecentric.android.timer.activity;

import org.junit.Test;

import de.codecentric.android.timer.activity.CountdownServiceClientDummyTest.DummyCountdownServiceClientImpl;
import de.codecentric.android.timer.service.ServiceState;

public class CountdownServiceClientDummyTest extends
		AbstractCountdownServiceClientTest<DummyCountdownServiceClientImpl> {

	@Override
	protected DummyCountdownServiceClientImpl createActivityInstance() {
		return new DummyCountdownServiceClientImpl();
	}

	@Override
	protected ServiceState getCurrentServiceState() {
		return ServiceState.WAITING;
	}

	@Test
	public void testAbstractCountdownServiceClientTestSetup() {
		// just make sure super.beforeAbstractCountdownServiceClientTest() works
	}

	static class DummyCountdownServiceClientImpl extends CountdownServiceClient {

		@Override
		protected ServiceState[] getHandledServiceStates() {
			// handle all states
			return ServiceState.values();
		}

		@Override
		protected ServiceState[] getFinishingServiceStates() {
			// handle all states
			return new ServiceState[] {};
		}

		@Override
		protected String getTag() {
			return DummyCountdownServiceClientImpl.class.getName();
		}
	}
}
