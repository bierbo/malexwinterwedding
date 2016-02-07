package at.linz.wedding;

import at.linz.wedding.Couple.RelationshipStatus;

public class Life {

	private static final int INT_MAX = Integer.MAX_VALUE;
	private static final String HOME = "";
	private static final boolean RICHER = true;
	private static final boolean POORER = true;
	private static final boolean SICKNESS = true;
	private static final boolean HEALTH = true;
	private static final String HANDS = "";
	private static final String FINGER = "ringfinger";
	private boolean happy_ever_after;

	public Memories happyTogether() {
		Human marlene = new Woman("4.1.");
		Human alex = new Man("23.9.");

		if (marlene.getChemistry().equals(alex.getChemistry())) {

			Couple marlene_alex = new Couple(marlene, alex, new Memories());
			marlene_alex.travel("curacao", "milwaukee", "england");
			marlene_alex.share("thoughts", "dreams", "friends",
					"family", "dinner", "WiFi");
			marlene_alex.study("KWM");
			marlene_alex.makeInternship("milwaukee");

			if (marlene_alex.checkConfidence() > INT_MAX) {

				doWedding(marlene_alex, "06.02.2016");
				Family thePichlers = new Family(marlene_alex);

				while (happy_ever_after) {

					thePichlers.connect("friends", "family", "strangers");
					marlene_alex.dance();
					marlene_alex.add(thePichlers, new Child());
					thePichlers.fillPhotoAlbum(new Photo());
					thePichlers.addMemories();
					marlene.talk(alex);
					thePichlers.build(HOME);
					marlene.clean(HOME);
					alex.wire(HOME);
					marlene_alex.doBetterWorld("educate",
							"code", "create", "share", "help");
				}
			}
			return marlene_alex.getLegacy();
		}

		return new Memories();
	}

	private Family doWedding(Couple couple, String date) {

		int vow = 0;
		while (vow < 2) {
			if (RICHER && POORER && SICKNESS && HEALTH) {
				couple.hold(HANDS);
				couple.attach("ring", FINGER);

				vow++;
			}
		}

		couple.doKiss();
		couple.setStatus(RelationshipStatus.MARRIED);
		Family newFamily = new Family(couple);
		newFamily.getCongratulations("friends","family");

		return newFamily;
	}

}
