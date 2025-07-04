package com.crist.adapterEjemplo;

import com.crist.adapterEjemplo.service.Impl.SquarePegAdapterImpl;
import com.crist.adapterEjemplo.service.RoundHole;
import com.crist.adapterEjemplo.service.RoundPeg;
import com.crist.adapterEjemplo.service.SquarePeg;

public class Main {
  public static void main(String[] args) {
    // Round fits round, no surprise.
    RoundHole hole = new RoundHole(5);
    RoundPeg rpeg = new RoundPeg(5);
    if (hole.fits(rpeg)) {
      System.out.println("Round peg r5 fits round hole r5.");
    }

    SquarePeg smallSqPeg = new SquarePeg(2);
    SquarePeg largeSqPeg = new SquarePeg(20);
    // hole.fits(smallSqPeg); // Won't compile.

    // Adapter solves the problem.
    SquarePegAdapterImpl smallSqPegAdapter = new SquarePegAdapterImpl(smallSqPeg);
    SquarePegAdapterImpl largeSqPegAdapter = new SquarePegAdapterImpl(largeSqPeg);
    if (hole.fits(smallSqPegAdapter)) {
      System.out.println("Square peg w2 fits round hole r5.");
    }
    if (!hole.fits(largeSqPegAdapter)) {
      System.out.println("Square peg w20 does not fit into round hole r5.");
    }
  }
}
