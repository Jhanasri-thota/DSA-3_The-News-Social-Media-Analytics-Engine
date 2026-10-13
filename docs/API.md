# API overview
Public: `GET /api/health`, `POST /api/auth/register`, `POST /api/auth/login`, `GET /api/news`, `GET /api/news/{id}`, `GET /api/social`, `GET /api/social/summary`, `GET /api/trending`.
Authenticated: `GET /api/auth/me`, `POST /api/auth/logout`, `GET /api/dashboard`, `POST /api/analysis`, `GET/POST /api/search-history`, `GET/POST/DELETE /api/bookmarks`, `GET /api/analysis-history`, `GET /api/notifications`, `POST /api/notifications/{id}/read`.
Algorithm routes: `POST /api/algorithms/kmp`, `/rabin-karp`, `/aho-corasick`, `/edit-distance`, `/lcs`, `/max-flow`, `/vertex-cover`, `/miller-rabin`, `/parallel-analysis`.
Admin: `GET /api/admin/users`, `POST/PUT/DELETE /api/admin/news...`.
